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