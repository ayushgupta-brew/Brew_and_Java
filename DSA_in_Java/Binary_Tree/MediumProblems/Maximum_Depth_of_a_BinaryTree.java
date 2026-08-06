package Binary_Tree.MediumProblems;

import Binary_Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Maximum_Depth_of_a_BinaryTree {
    public static void main(String[] args) {

        // Create the binary tree
        //
        //          1
        //        /   \
        //       2     3
        //            /   \
        //           4     6
        //          /
        //         5
        //
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(5);

        // Find the maximum depth of the tree
        int answer = maximumDepth(root);

        // Print the result
        System.out.println(answer);
    }

    // Returns the maximum depth of a binary tree using BFS
    public static int maximumDepth(TreeNode root) {

        // If tree is empty, depth is 0
        if (root == null) {
            return 0;
        }

        // Queue is used for level order traversal
        Queue<TreeNode> queue = new ArrayDeque<>();

        // Store the number of levels processed
        int level = 0;

        // Start BFS from root
        queue.add(root);

        // Process the tree level by level
        while (!queue.isEmpty()) {

            // Number of nodes in the current level
            int size = queue.size();

            // Traverse all nodes of the current level
            for (int i = 0; i < size; i++) {

                // Remove front node from queue
                TreeNode front = queue.poll();

                // Add left child if present
                if (front.left != null) {
                    queue.add(front.left);
                }

                // Add right child if present
                if (front.right != null) {
                    queue.add(front.right);
                }
            }

            // One full level is completed
            level++;
        }

        // Total levels = maximum depth
        return level;
    }
}
