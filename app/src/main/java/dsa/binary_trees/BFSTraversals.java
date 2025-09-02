package dsa.binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversals {

    // Helper: demo tree with ints
    // Structure (level order = 1 2 3 4 5 6):
    //         1
    //        / \
    //       2   3
    //      / \   \
    //     4   5   6
    private TreeNode demoTree() {
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);

        n1.left = n2;  n1.right = n3;
        n2.left = n4;  n2.right = n5;
        n3.right = n6;
        return n1;
    }

    // Parameterless BFS to match your test style.
    // Builds a demo tree whose level-order string is "123456" (not letters).
    public String bfs() {
        TreeNode root = demoTree();
        return bfs(root); // now bfs(root) returns String
    }

    // Standard BFS that returns the concatenation of node values in level order.
    public String bfs(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            sb.append(node.val);
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return sb.toString();
    }
}
