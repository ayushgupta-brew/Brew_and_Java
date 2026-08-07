package Binary_Tree.MediumProblems;

import Binary_Tree.TreeNode;

public class Diameter_of_Binary_Tree {
    public static void main(String[] args) {

        /*
         * Binary Tree:
         *
         *          1
         *        /   \
         *       2     3
         *      / \
         *     4   5
         *
         * Longest path:
         * 4 -> 2 -> 1 -> 3
         *
         * Diameter = 3 edges
         */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Brute Force Approach
        int bruteForceAnswer = diameterBruteForce(root);
        System.out.println("Brute Force: " + bruteForceAnswer);

        // Optimal Approach
        int optimalAnswer = diameterOptimal(root);
        System.out.println("Optimal: " + optimalAnswer);
    }


    /*
     * ============================================================
     * BRUTE FORCE APPROACH
     * ============================================================
     *
     * For every node:
     *
     * 1. Calculate height of left subtree.
     * 2. Calculate height of right subtree.
     * 3. Diameter passing through current node =
     *
     *       leftHeight + rightHeight
     *
     * 4. Find diameter of left subtree.
     * 5. Find diameter of right subtree.
     * 6. Take maximum of all three.
     *
     * Time Complexity: O(N²)
     * Space Complexity: O(H)
     */
    public static int diameterBruteForce(TreeNode root) {

        // Empty tree has diameter 0
        if (root == null) {
            return 0;
        }

        // Height of left subtree
        int leftHeight = getHeight(root.left);

        // Height of right subtree
        int rightHeight = getHeight(root.right);

        // Diameter passing through current node
        int currentDiameter = leftHeight + rightHeight;

        // Find diameter of left subtree
        int leftDiameter = diameterBruteForce(root.left);

        // Find diameter of right subtree
        int rightDiameter = diameterBruteForce(root.right);

        // Return the maximum diameter
        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }


    /*
     * ============================================================
     * HEIGHT FUNCTION
     * ============================================================
     *
     * Height is calculated using:
     *
     * height = 1 + max(leftHeight, rightHeight)
     *
     * null node -> height 0
     *
     * Example:
     *
     *        1
     *       / \
     *      2   3
     *
     * height(2) = 1
     * height(3) = 1
     *
     * height(1) = 1 + max(1, 1)
     *           = 2
     */
    private static int getHeight(TreeNode root) {

        // Empty subtree has height 0
        if (root == null) {
            return 0;
        }

        // Calculate left subtree height
        int leftHeight = getHeight(root.left);

        // Calculate right subtree height
        int rightHeight = getHeight(root.right);

        // Current node height
        return 1 + Math.max(leftHeight, rightHeight);
    }


    /*
     * ============================================================
     * OPTIMAL APPROACH
     * ============================================================
     *
     * Instead of calculating height separately for every node,
     * calculate height and diameter together in one DFS.
     *
     * At every node:
     *
     * 1. Get left subtree height.
     * 2. Get right subtree height.
     * 3. Calculate current diameter.
     * 4. Update maximum diameter.
     * 5. Return current height to parent.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(H)
     */
    public static int diameterOptimal(TreeNode root) {

        // Array is used so that the helper method
        // can update the diameter value.
        int[] maxDiameter = new int[1];

        // Calculate height and diameter together
        calculateHeight(root, maxDiameter);

        return maxDiameter[0];
    }


    /*
     * Helper method for optimal approach.
     *
     * Returns:
     *     Height of the current subtree
     *
     * Also updates:
     *     maxDiameter[0]
     */
    private static int calculateHeight(TreeNode root, int[] maxDiameter) {

        // Empty subtree has height 0
        if (root == null) {
            return 0;
        }

        // Calculate left subtree height
        int leftHeight = calculateHeight(root.left, maxDiameter);

        // Calculate right subtree height
        int rightHeight = calculateHeight(root.right, maxDiameter);

        /*
         * Diameter passing through current node:
         *
         * leftHeight
         *      +
         * rightHeight
         */
        int currentDiameter = leftHeight + rightHeight;

        // Update maximum diameter
        maxDiameter[0] = Math.max(maxDiameter[0], currentDiameter);

        /*
         * Return height of current node to its parent.
         *
         * Height =
         * 1 + maximum height of left/right subtree
         */
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
