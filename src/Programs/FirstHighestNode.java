package Programs;

public class FirstHighestNode {

	public TreeNode findRecursive(TreeNode root, int n) {
		TreeNode temp = null;
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null && root.info > n) {
			return root;
		}
		if (root.info < n) {
			temp = root;
			findRecursive(root.right, n);
		} else {
			temp = root;
			findRecursive(root.left, n);
		}
		return root;
	}

	public static void main(String[] args) {
		FirstHighestNode obj = new FirstHighestNode();
		System.out.println();
	}

}
