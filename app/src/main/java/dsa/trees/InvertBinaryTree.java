package dsa.trees;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(6)));

        InvertBinaryTree inverter = new InvertBinaryTree();
        TreeNode inverted = inverter.invertTree(root);

        TreeTraversalExamples t = new TreeTraversalExamples();
        System.out.print("Inverted Preorder: " + t.preorder(inverted)); // [1, 3, 6, 2, 5, 4]
    }

}
