package Binary_Tree.MediumProblems;

import Binary_Tree.TreeNode;

public class Maximum_Path_Sum {
    public static void main(String[] args){
        TreeNode root = new TreeNode(-10);
         root.left = new TreeNode(9);
         root.right = new TreeNode(20);
         root.right.left = new TreeNode(15);
         root.right.right = new TreeNode(7);

        int maxPathSum = maxPathSum(root);
        System.out.println(maxPathSum);
    }

    // Stores the maximum path sum found anywhere in the tree.
    private static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {

        // Calculates the maximum path contribution
        // that can be returned to the parent.
        getMaxPathSum(root);

        return maxSum;
    }

    private static int getMaxPathSum(TreeNode root) {

        // Base case: no contribution from a null node.
        if (root == null) {
            return 0;
        }

        // Maximum contribution from the left subtree.
        // Ignore negative paths because they decrease the sum.
        int left = Math.max(0, getMaxPathSum(root.left));

        // Maximum contribution from the right subtree.
        // Ignore negative paths for the same reason.
        int right = Math.max(0, getMaxPathSum(root.right));

        // Path passing through the current node.
        // This path can use both left and right branches.
        int currentPathSum = root.value + left + right;

        // Update the global maximum path sum.
        maxSum = Math.max(maxSum, currentPathSum);

        // Return only one branch to the parent.
        // A path returned to the parent cannot contain both
        // left and right branches because that would create
        // a fork in the path.
        return root.value + Math.max(left, right);
    }
}
