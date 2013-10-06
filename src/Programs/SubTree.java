package Programs;

public class SubTree {

	public boolean isSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 != null && root2 == null) {
			return true;
		}
		if (root1 == null && root2 != null) {
			return false;
		}
		boolean isSubtree = isSubtreeHelper(root1, root2);
		return isSubtree;
	}

	private boolean isSubtreeHelper(TreeNode root1, TreeNode root2) {
		if (root1 != null && root2 != null) {
			if (root1.info == root2.info) {
				return (isSubtree(root1.left, root2.left) && isSubtree(
						root1.right, root2.right));
			} else {
				return (isSubtree(root1.left, root2) || isSubtree(root1.right,
						root2));
			}
		}
		return false;
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);

		// TreeNode node8 = new TreeNode(8);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		SubTree obj = new SubTree();
		System.out.println(obj.isSubtree(node1, node5));
	}

}
