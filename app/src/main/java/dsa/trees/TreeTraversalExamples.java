package dsa.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversalExamples {

    public void preorderPrint(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preorderPrint(root.left); // we recursively go down the left hand side
        preorderPrint(root.right); // we recursively go down the right hand side
    }

    public void inorderPrint(TreeNode root) {
        if (root == null)
            return;
        inorderPrint(root.left); // we recursively go down the left hand side
        System.out.print(root.val + " ");
        inorderPrint(root.right); // we recursively go down the right hand side
    }

    public void postorderPrint(TreeNode root) {
        if (root == null)
            return;
        postorderPrint(root.left); // we recursively go down the left hand side
        postorderPrint(root.right); // we recursively go down the right hand side
        System.out.print(root.val + " "); // then finally we print out the root
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        result.add(node.val);
        preorderHelper(node.left, result); // we recursively go down the left hand side
        preorderHelper(node.right, result); // we recursively go down the right hand side
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        inorderHelper(node.left, result);
        result.add(node.val); // we recursively go down the left hand side
        inorderHelper(node.right, result); // we recursively go down the right hand side
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorderHelper(node.left, result); // we recursively go down the left hand side
        postorderHelper(node.right, result); // we recursively go down the right hand side
        result.add(node.val);
    }

    public List<Integer> preorder(TreeNode root) {
        List<Integer> resultantList = new ArrayList<>();
        preorderHelper(root, resultantList);
        return resultantList;
    }

    public List<Integer> inorder(TreeNode root) {
        List<Integer> resultantList = new ArrayList<>();
        inorderHelper(root, resultantList);
        return resultantList;
    }

    public List<Integer> postorder(TreeNode root) {
        List<Integer> resultantList = new ArrayList<>();
        postorderHelper(root, resultantList);
        return resultantList;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );

        TreeTraversalExamples treeTraversalExamples = new TreeTraversalExamples();

        System.out.print("preorder traversal" + "\n");
        treeTraversalExamples.preorderPrint(root);
        System.out.print("\n" + "inorder traversal" + "\n");
        treeTraversalExamples.inorderPrint(root);
        System.out.print("\n" + "postorder traversal" + "\n");
        treeTraversalExamples.postorderPrint(root);

        System.out.print("\n" + "preorder list traversal" + "\n" + treeTraversalExamples.preorder(root));
        System.out.print("\n" + "inorder list traversal" + "\n" + treeTraversalExamples.inorder(root));
        System.out.print("\n" + "postorder list traversal" + "\n" + treeTraversalExamples.postorder(root));
    }

}
