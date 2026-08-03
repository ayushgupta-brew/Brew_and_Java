package Binary_Tree;

/*
TreeNode class represents a single node in a Binary Tree.
Each node contains:
1. A value (data)
2. Reference to the left child
3. Reference to the right child
*/
class TreeNode {

    // Data stored inside the node
    int value;

    // Reference to the left child
    TreeNode left;

    // Reference to the right child
    TreeNode right;

    // Constructor to initialize a node
    TreeNode(int value) {

        // Store the passed value into the current object's value
        this.value = value;

        // Initially, the node has no children
        left = null;
        right = null;
    }
}