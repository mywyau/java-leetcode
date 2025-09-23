package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import dsa.binary_trees.BFSTraversalsExample;
import dsa.binary_trees.TreeNode;

class BFSTraversalsExampleSpec {

    BFSTraversalsExample BFSTraversalsExample = new BFSTraversalsExample();

    private TreeNode buildDemoTree() {
        // Same structure:
        //        1
        //       / \
        //      2   3
        //     / \   \
        //    4   5   6
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

    @Test
    void testDemoTreeProduces123456() {
        TreeNode root = buildDemoTree();
        String result = BFSTraversalsExample.bfs(root);
        assertEquals("123456", result);
    }

    @Test
    void testEmptyTreeProducesEmptyString() {
        TreeNode root = null;
        String result = BFSTraversalsExample.bfs(root);
        assertEquals("", result);
    }

    @Test
    void testSingleNodeTreeProducesValue() {
        TreeNode root = new TreeNode(42);
        String result = BFSTraversalsExample.bfs(root);
        assertEquals("42", result);
    }
}
