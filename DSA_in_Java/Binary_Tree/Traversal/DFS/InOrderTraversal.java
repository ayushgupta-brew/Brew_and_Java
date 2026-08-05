package Binary_Tree.Traversal.DFS;

import Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static void main(String[] args) {

        // Create the binary tree
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

        // Perform inorder traversal using DFS
        List<Integer> answer = inorderTraversalDFS(root);

        // Print the traversal result
        System.out.println(answer);
    }

    // Main method that returns inorder traversal of the tree
    public static List<Integer> inorderTraversalDFS(TreeNode root) {
        // Stores the final inorder result
        List<Integer> result = new ArrayList<>();

        // Start recursive traversal
        inorder(root, result);

        return result;
    }

    // Recursive helper method for inorder traversal
    // Inorder order = Left -> Root -> Right
    private static void inorder(TreeNode root, List<Integer> result) {

        // Base case: stop when node is null
        if (root == null) {
            return;
        }

        // 1. Traverse left subtree first
        inorder(root.left, result);

        // 2. Visit current node
        result.add(root.value);

        // 3. Traverse right subtree last
        inorder(root.right, result);
    }
}