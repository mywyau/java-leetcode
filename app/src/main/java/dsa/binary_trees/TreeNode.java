package dsa.binary_trees;


// we need to define tree nodes for tree based problems

// this version does not have a constructor for convenience

public class TreeNode {
    
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

// defining a tree

// TreeNode root = new TreeNode(3);
// root.left = new TreeNode(9);
// root.right = new TreeNode(20);
// root.right.left = new TreeNode(15);
// root.right.right = new TreeNode(7);

// ----------------------------------------


// Tree node with left, right constructors for easier tree construction

// public class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int val) { this.val = val; }

//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// defining a tree

// TreeNode root = new TreeNode(3,
//     new TreeNode(9),
//     new TreeNode(20, new TreeNode(15), new TreeNode(7))
// );


