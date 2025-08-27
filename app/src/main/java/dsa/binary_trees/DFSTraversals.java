package dsa.binary_trees;

import java.util.ArrayList;
import java.util.List;

public class DFSTraversals {

    // Preorder: Root, Left, Right
    public List<Integer> preorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderDfs(root, result);
        return result;
    }

    private void preorderDfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preorderDfs(node.left, result);
        preorderDfs(node.right, result);
    }

    // Inorder: Left, Root, Right
    public List<Integer> inorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderDfs(root, result);
        return result;
    }

    private void inorderDfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        inorderDfs(node.left, result);
        result.add(node.val);
        inorderDfs(node.right, result);
    }

    // Postorder: Left, Right, Root
    public List<Integer> postorder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderDfs(root, result);
        return result;
    }

    private void postorderDfs(TreeNode node, List<Integer> result) {
        if (node == null) return;
        postorderDfs(node.left, result);
        postorderDfs(node.right, result);
        result.add(node.val);
    }
}
