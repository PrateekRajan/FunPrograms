package Programs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {

	public TreeNode BFT(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return root;
		}

		TreeNode temp = BFTHelper(root);
		return temp;
	}

	private TreeNode BFTHelper(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.remove();
			System.out.println(temp.info);
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		return null;
	}

	public static void main(String[] args) {
		BreadthFirstTraversal bft = new BreadthFirstTraversal();
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

		bft.BFT(node1);

	}

}
