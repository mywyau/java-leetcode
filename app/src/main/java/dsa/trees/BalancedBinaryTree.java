package dsa.trees;

// Time	    O(n) — visit each node once
// Space	O(h) — height of the recursion stack


public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode node) {

        if (node == null)
            return 0;

        int left = checkHeight(node.left);

        if (left == -1)
            return -1;

        int right = checkHeight(node.right);

        if (right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode balanced = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));

        TreeNode unbalanced = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        null),
                null);

        BalancedBinaryTree checker = new BalancedBinaryTree();
        System.out.println("Balanced? " + checker.isBalanced(balanced)); // true
        System.out.println("Balanced? " + checker.isBalanced(unbalanced)); // false
    }
}
