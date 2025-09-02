package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dsa.trees.MaxDepthBinaryTree;
import dsa.trees.TreeNode;

public class MaxDepthBinaryTreeSpec {

    @Test
    void testMaxDepth() {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();
        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(1);
        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();
        assertEquals(1, solution.maxDepth(root));
    }

    @Test
    void testEmptyTree() {
        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();
        assertEquals(0, solution.maxDepth(null));
    }
}
