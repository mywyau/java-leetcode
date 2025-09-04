package dsa.trees;

public class SymmetricTree {

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {

        // Symmetric example:
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));

        // Asymmetric example:
        TreeNode asymmetricTree = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), null),
                new TreeNode(2, new TreeNode(3), null));

        SymmetricTree symmetricTree = new SymmetricTree();
        System.out.println("Is symmetric tree, symmetric? " + symmetricTree.isSymmetric(root)); // true
        System.out.println("Is my asymmetricTree, symmetric? " + symmetricTree.isSymmetric(asymmetricTree)); // true
    }

}
