package Binary_Tree.Traversal.DFS.Iterative;

import Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversalIterative {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);
        root.right = new TreeNode(7);

        List<Integer> answer = inorderTraversal(root);

        System.out.println(answer);
    }
    public static List<Integer> inorderTraversal(TreeNode root){

        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while(true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                result.add(node.value);
                node = node.right;
            }
        }
            return result;
    }
}