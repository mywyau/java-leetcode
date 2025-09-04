package dsa.trees;

// Time & Space Complexity

// Measure	Value
// Time	    O(n) — each node is visited once
// Space	O(h) — height of the tree (due to recursion stack)


// Recursion visits every node once.
// Base case handles leaf children.
// The 1 + Math.max(...) step builds up the answer as the call stack unwinds.

public class MaxDepthBinaryTree {

    // This is a post-order DFS traversal.
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int currentDepth = 1 + Math.max(leftDepth, rightDepth);
        System.out.println("Node: " + root.val + " → Depth: " + currentDepth);

        return currentDepth;
    }

    public static void main(String[] args) {
        // Build sample tree:
        //      1
        //     /  \
        //    2    3
        //  /  \
        // 4    5

        TreeNode root = 
            new TreeNode(
                1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)), 
                new TreeNode(3)
            );

        MaxDepthBinaryTree solver = new MaxDepthBinaryTree();
        int depth = solver.maxDepth(root);
        System.out.println("Maximum Depth of Tree: " + depth);
    }
}
