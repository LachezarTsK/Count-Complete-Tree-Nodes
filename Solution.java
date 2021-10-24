
public class Solution {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = countLeftHeight(root);
        int rightHeight = countRightHeight(root);

        if (leftHeight == rightHeight) {
            return (int) Math.pow(2, leftHeight) - 1;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int countLeftHeight(TreeNode root) {
        TreeNode current = root;
        int counter = 1;
        while (current.left != null) {
            current = current.left;
            counter++;
        }
        return counter;
    }

    public int countRightHeight(TreeNode root) {
        TreeNode current = root;
        int counter = 1;
        while (current.right != null) {
            current = current.right;
            counter++;
        }
        return counter;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
