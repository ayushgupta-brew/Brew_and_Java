package Binary_Tree.MediumProblems;

import Binary_Tree.TreeNode;

public class Balanced_Binary_Tree {
    public static void main(String[] args) {

        // Example tree:
        //
        //         3
        //       /   \
        //      9     20
        //           /  \
        //          15   7
        //
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Brute force check
        boolean bruteForceAnswer = bruteForceApproach(root);
        System.out.println("Brute Force: " + bruteForceAnswer);

        // Optimal check
        boolean optimalAnswer = optimalApproach(root);
        System.out.println("Optimal: " + optimalAnswer);
    }

    /*
     * BRUTE FORCE APPROACH
     *
     * Idea:
     * 1. Find height of left subtree
     * 2. Find height of right subtree
     * 3. Check if the difference is <= 1
     * 4. Recursively check left and right subtrees
     *
     * Time Complexity:
     * O(n^2) in worst case
     * because height is recalculated again and again
     */
    public static boolean bruteForceApproach(TreeNode root) {

        // Empty tree is balanced
        if (root == null) {
            return true;
        }

        // Height of left subtree
        int leftHeight = bruteForceCheckHeight(root.left);

        // Height of right subtree
        int rightHeight = bruteForceCheckHeight(root.right);

        // Check current node balance
        // and also check balance of left and right subtrees
        return Math.abs(leftHeight - rightHeight) <= 1
                && bruteForceApproach(root.left)
                && bruteForceApproach(root.right);
    }

    /*
     * HEIGHT FUNCTION
     *
     * How height is taken:
     * - null node -> height = 0
     * - leaf node -> height = 1
     * - any other node -> 1 + max(leftHeight, rightHeight)
     *
     * Example:
     * For this tree:
     *        1
     *       / \
     *      2   3
     *
     * bruteForceCheckHeight(2) = 1
     * bruteForceCheckHeight(3) = 1
     * bruteForceCheckHeight(1) = 1 + max(1, 1) = 2
     */
    private static int bruteForceCheckHeight(TreeNode root) {

        // Base case: empty subtree has height 0
        if (root == null) {
            return 0;
        }

        // Find height of left subtree
        int leftHeight = bruteForceCheckHeight(root.left);

        // Find height of right subtree
        int rightHeight = bruteForceCheckHeight(root.right);

        // Current node height = 1 + taller subtree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    /*
     * OPTIMAL APPROACH
     *
     * Idea:
     * While calculating height, also check balance.
     *
     * Return values:
     * - non-negative number -> height of subtree
     * - -1 -> subtree is not balanced
     *
     * If any subtree returns -1, stop early.
     *
     * Time Complexity:
     * O(n)
     */
    public static boolean optimalApproach(TreeNode root) {
        return OptimalApproachCheckHeight(root) != -1;
    }

    /*
     * Helper for optimal approach
     *
     * Returns:
     * - height of subtree if balanced
     * - -1 if subtree is not balanced
     */
    private static int OptimalApproachCheckHeight(TreeNode root) {

        // Empty tree has height 0
        if (root == null) {
            return 0;
        }

        // Check left subtree
        int leftHeight = OptimalApproachCheckHeight(root.left);
        if (leftHeight == -1) {
            return -1; // left side already unbalanced
        }

        // Check right subtree
        int rightHeight = OptimalApproachCheckHeight(root.right);
        if (rightHeight == -1) {
            return -1; // right side already unbalanced
        }

        // If current node is unbalanced, return -1
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Otherwise return current height
        return 1 + Math.max(leftHeight, rightHeight);
    }
}