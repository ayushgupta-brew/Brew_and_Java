package Binary_Tree.Traversal.DFS.Iterative;

import Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalIterative {
    public static void main(String[] args) {

        // Build the binary tree
        //
        //              1
        //           /     \
        //          2       7
        //        /   \
        //       3     4
        //            /   \
        //           5     6
        //
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        root.right = new TreeNode(7);

        // Perform iterative inorder traversal
        List<Integer> answer = inorderTraversal(root);

        // Print traversal result
        System.out.println(answer);
    }

    // Iterative Inorder Traversal
// Inorder order = Left -> Root -> Right
    public static List<Integer> inorderTraversal(TreeNode root) {

        // Stores the final traversal result
        List<Integer> result = new ArrayList<>();

        // If tree is empty, return empty list
        if (root == null) {
            return result;
        }

        // Stack is used to simulate recursion
        Stack<TreeNode> stack = new Stack<>();

        // Start traversal from root
        TreeNode node = root;

        // Keep running until both:
        // 1. current node becomes null
        // 2. stack becomes empty
        while (node != null ||!stack.isEmpty()) {

            // Go as far left as possible
            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                // Backtrack to the last saved node
                node = stack.pop();

                // Visit the current node
                result.add(node.value);

                // Move to the right subtree
                node = node.right;
            }
        }

        return result;
    }
}
