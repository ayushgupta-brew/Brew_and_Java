package Binary_Tree;

/*
Binary Tree Representation

            1
          /   \
         2     3
        / \   / \
       4   5 6   7
*/

public class BinaryTreeImplementation {

    public static void main(String[] args) {

        // Create the root node
        TreeNode root = new TreeNode(1);

        // Create left and right children of root
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Create children of node 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Create children of node 3
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        /*
                Final Binary Tree

                        1
                      /   \
                     2     3
                    / \   / \
                   4   5 6   7
         */
    }
}

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