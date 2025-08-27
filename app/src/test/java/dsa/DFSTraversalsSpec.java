package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import dsa.binary_trees.DFSTraversals;
import dsa.binary_trees.TreeNode;

class DFSTraversalsSpec {

    DFSTraversals dfs = new DFSTraversals();

    @Test
    void handlesNullRoot() {
        assertEquals(List.of(), dfs.preorder(null));
        assertEquals(List.of(), dfs.inorder(null));
        assertEquals(List.of(), dfs.postorder(null));
    }

    @Test
    void handlesSingleNode() {
        TreeNode root = new TreeNode(42);
        assertEquals(List.of(42), dfs.preorder(root));
        assertEquals(List.of(42), dfs.inorder(root));
        assertEquals(List.of(42), dfs.postorder(root));
    }

    @Test
    void traversalsOnTypicalTree() {
        // Build:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

        assertEquals(List.of(1, 2, 4, 5, 3), dfs.preorder(n1)); // Root, Left, Right
        assertEquals(List.of(4, 2, 5, 1, 3), dfs.inorder(n1)); // Left, Root, Right
        assertEquals(List.of(4, 5, 2, 3, 1), dfs.postorder(n1)); // Left, Right, Root
    }

    @Test
    void unbalancedTree() {
        // 1
        // \
        // 2
        // \
        // 3
        TreeNode n1 = new TreeNode(1);
        n1.right = new TreeNode(2);
        n1.right.right = new TreeNode(3);

        assertEquals(List.of(1, 2, 3), dfs.preorder(n1));
        assertEquals(List.of(1, 2, 3), dfs.inorder(n1)); // all right → same order
        assertEquals(List.of(3, 2, 1), dfs.postorder(n1));
    }
}
