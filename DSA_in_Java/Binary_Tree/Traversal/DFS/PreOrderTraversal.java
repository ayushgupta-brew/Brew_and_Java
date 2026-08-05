package Binary_Tree.Traversal.DFS;

import java.util.ArrayList;
import java.util.List;
import Binary_Tree.TreeNode;

public class PreOrderTraversal {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> answer = preorderTraversalDFS(root);
        System.out.println(answer);

    }

    public static List<Integer> preorderTraversalDFS(TreeNode root){

        // Stores the preorder traversal
        List<Integer> result = new ArrayList<>();

        // Start recursive traversal
        preorder(root, result);

        return result;
    }

    // Recursive helper method for inorder traversal
    // PreOrder order = Root -> Left -> Right
    private static void preorder(TreeNode root, List<Integer> result) {

        // Base case: stop if node is null
        if (root == null) {
            return;
        }

        // 1. Visit Root
        result.add(root.value);

        // 2. Traverse Left Subtree
        preorder(root.left, result);

        // 3. Traverse Right Subtree
        preorder(root.right, result);
    }
}