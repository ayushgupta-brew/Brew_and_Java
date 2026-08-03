package Binary_Tree.Traversal.BFS;

import Binary_Tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class LevelOrderTraversal {

    public static void main(String[] args) {

        // Construct the binary tree
        //
        //          1
        //        /   \
        //       2     3
        //      / \   / \
        //     4  5  6   7
        //
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform Level Order (BFS) Traversal
        List<List<Integer>> lists = levelOrderTraversalBFS(root);

        // Print level-wise result
        System.out.println("Level Order:");
        System.out.println(lists);
        // Output: [[1], [2, 3], [4, 5, 6, 7]]

        // Convert nested list into a single normal list
        List<Integer> normalList = lists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("\nNormal List:");
        System.out.println(normalList);
        // Output: [1, 2, 3, 4, 5, 6, 7]
    }

    // Performs Breadth First Search (Level Order Traversal)
    public static List<List<Integer>> levelOrderTraversalBFS(TreeNode root) {

        // Stores the final answer level by level
        List<List<Integer>> result = new ArrayList<>();

        // If tree is empty, return an empty list
        if (root == null) {
            return result;
        }

        // Queue is used for BFS traversal
        Queue<TreeNode> queue = new ArrayDeque<>();

        // Start traversal from the root
        queue.add(root);

        // Continue until all nodes are processed
        while (!queue.isEmpty()) {

            // Number of nodes present in the current level
            int levelSize = queue.size();

            // Stores values of the current level
            List<Integer> level = new ArrayList<>();

            // Process all nodes of the current level
            for (int i = 0; i < levelSize; i++) {

                // Remove the front node
                TreeNode node = queue.poll();

                // Store its value
                level.add(node.value);

                // Add left child to the queue
                if (node.left != null)
                    queue.add(node.left);

                // Add right child to the queue
                if (node.right != null)
                    queue.add(node.right);
            }

            // Store the completed level
            result.add(level);
        }

        // Return the level-wise traversal
        return result;
    }
}