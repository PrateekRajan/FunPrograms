package Programs;

public class BinaryTree {

	/*
	 * Its a BST so sort it and find the next highest element for the given
	 * input
	 */

	public static TreeNode nextHighest(TreeNode root, int input) {
		if (root.right != null) {

		}

		return null;

	}

	public static int sumOfNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.info;
		}
		int leftSum = sumOfNodes(root.left) + root.info;
		int rightSum = sumOfNodes(root.right) + root.info;
		return (leftSum + rightSum - root.info);
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode a,
			TreeNode b) {
		TreeNode left = null;
		TreeNode right = null;
		if (root == null || root == a || root == b) {
			return root;
		}
		left = lowestCommonAncestor(root.left, a, b);
		right = lowestCommonAncestor(root.right, a, b);
		if (left != null && right != null) {
			return root;
		}
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}
		return null;
	}

	public static boolean isBST(TreeNode root, int MAX, int MIN) {

		if (root == null) {
			return true;
		}
		if (root.info > MIN && root.info < MAX) {
			return (isBST(root.left, root.info, MIN) && isBST(root.right, MAX,
					root.info));
		}
		return false;
	}

	public static int size(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			return (size(node.left) + 1 + size(node.right));
		}
	}

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return (Math.max(maxDepth(root.left), maxDepth(root.right) + 1));
	}

	public static boolean hasDepth(TreeNode root, int sum) {
		if (root == null) {
			return (sum == 0);
		} else {
			int subsum = sum - root.info;
			return (hasDepth(root.left, subsum) || hasDepth(root.right, subsum));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode parent = new TreeNode(3);
		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(5);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(7);

		parent.left = node1;
		parent.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;

		// System.out.println(parent.info);
		// System.out.println(parent.left.info);
		// System.out.println(parent.right.info);
		System.out.println("The size of tree is " + size(parent));
		System.out.println("The max depth of tree is " + maxDepth(parent));
		System.out.println("There is path with sum 8" + hasDepth(parent, 5));
		System.out.println("Is the tree Binary Search Tree "
				+ isBST(parent, Integer.MAX_VALUE, Integer.MIN_VALUE));
		System.out.println("Lowest Common Ancestor is "
				+ lowestCommonAncestor(parent, node6, node4).info);
		System.out.println("Next Highest Element is " + nextHighest(parent, 6));
		System.out.println("Sum of all the nodes in the tree is "
				+ sumOfNodes(parent));

	}

}
