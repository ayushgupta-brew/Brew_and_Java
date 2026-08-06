package Binary_Tree.Traversal.DFS.Iterative;

import Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalIterative {
    public static void main(String[] args) {

        // Build the binary tree
        //
        //              1
        //           /     \
        //          2       3
        //        /   \       \
        //       4     5       8
        //            / \     /
        //           6   7   9
        //
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);

        // Perform iterative preorder traversal
        List<Integer> answer = preorderTraversal(root);

        // Print result
        System.out.println(answer);
    }

    // Iterative Preorder Traversal
// Preorder order = Root -> Left -> Right
    public static List<Integer> preorderTraversal(TreeNode root) {

        // Stores the final traversal result
        List<Integer> result = new ArrayList<>();

        // If tree is empty, return empty list
        if (root == null) {
            return result;
        }

        // Stack is used to simulate recursion
        Stack<TreeNode> stack = new Stack<>();

        // Start with the root node
        stack.push(root);

        // Continue until all nodes are processed
        while (!stack.isEmpty()) {

            // Remove the top node from stack
            root = stack.pop();

            // Visit the current node
            result.add(root.value);

            // Push right child first
            // so that left child is processed first
            if (root.right != null) {
                stack.push(root.right);
            }

            // Push left child second
            if (root.left != null) {
                stack.push(root.left);
            }
        }

        return result;
    }
}