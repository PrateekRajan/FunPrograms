package Programs;

import java.util.ArrayList;
import java.util.LinkedList;

public class LevelListTree {

	public static ArrayList<LinkedList<TreeNode>> level(TreeNode root) {
		if (root == null) {
			return null;
		}
		int level = 0;
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> levelList = new LinkedList<TreeNode>();
		// Added root to the level list so that it can be added to the main
		// result list later
		levelList.add(root);
		// Adding root to the result list
		result.add(level, levelList);
		while (true) {
			// Creating a new list for each level
			levelList = new LinkedList<TreeNode>();
			/*
			 * Getting into result list and then into the specific index(level)
			 * and extracting the TreeNodes from the levelList and checking if
			 * the nodes in levelList have any children and add them to
			 * levelList if exists
			 */
			for (int i = 0; i < result.get(level).size(); i++) {
				TreeNode n = result.get(level).get(i);
				if (n.left != null) {
					levelList.add(n.left);
				}
				if (n.right != null) {
					levelList.add(n.right);
				}
			}
			// If the list is not empty then add it to result
			if (levelList.size() > 0) {
				result.add(level + 1, levelList);
				// List empty so don't add to result and we have reached at the
				// leaf nodes of the tree
			} else {
				break;
			}
			// Increment level to go to next level and repeat the procedure
			level++;
		}
		return result;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		ArrayList<LinkedList<TreeNode>> temp = level(node1);
		for (int i = 0; i < temp.size(); i++) {
			LinkedList<TreeNode> list = temp.get(i);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j).info + " ");
			}
			System.out.println("\n");
		}

	}
}
