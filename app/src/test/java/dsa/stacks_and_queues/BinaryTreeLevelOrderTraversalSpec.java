package dsa.stacks_and_queues;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import dsa.stacks_and_queues.binary_tree_level_order_traversal.BinaryTreeLevelOrderTraversal;
import dsa.stacks_and_queues.binary_tree_level_order_traversal.TreeNode;

class BinaryTreeLevelOrderTraversalSpec {

    BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();

    @Test
    void testNullTree() {
        assertEquals(List.of(), traversal.levelOrder(null));
    }

    @Test
    void testSingleNode() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> result = traversal.levelOrder(root);
        assertEquals(List.of(List.of(1)), result);
    }

    @Test
    void testMultiLevelTree() {
        /*
         * 1
         * / \
         * 2 3
         * / \ \
         * 4 5 6
         */
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n3 = new TreeNode(3, null, n6);
        TreeNode root = new TreeNode(1, n2, n3);

        List<List<Integer>> result = traversal.levelOrder(root);

        assertEquals(
                List.of(
                        List.of(1),
                        List.of(2, 3),
                        List.of(4, 5, 6)),
                result);
    }
}
