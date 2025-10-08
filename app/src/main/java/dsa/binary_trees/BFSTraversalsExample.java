package dsa.binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversalsExample {

    /*
     * Helper: demo tree with ints
     * Structure (level order = 1 2 3 4 5 6):
     *      1
     *     / \
     *    2   3
     *   / \   \
     *  4   5  6
     */

    public TreeNode demoTree() {
        
        TreeNode n6 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        return n1;
    }

    public String bfs(TreeNode root) {

        if (root == null)
            return "";

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            sb.append(node.val);
            if (node.left != null)
                q.offer(node.left);
            if (node.right != null)
                q.offer(node.right);
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {

        BFSTraversalsExample bfsTraversalsExamples = new BFSTraversalsExample();

        TreeNode demoTree = bfsTraversalsExamples.demoTree();
        System.out.println(bfsTraversalsExamples.bfs(demoTree));
    }
}
