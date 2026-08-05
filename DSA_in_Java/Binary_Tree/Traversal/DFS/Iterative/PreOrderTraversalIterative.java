package Binary_Tree.Traversal.DFS.Iterative;

import Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalIterative {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left =new TreeNode(2);

        root.right =new TreeNode(3);

        root.left.left =new TreeNode(4);

        root.left.right =new TreeNode(5);

        root.left.right.left =new TreeNode(6);

        root.left.right.right =new TreeNode(7);

        root.right.right =new TreeNode(8);

        root.right.right.left =new TreeNode(9);

        List<Integer> answer = preorderTraversal(root);

        System.out.println(answer);
    }
    public static List<Integer> preorderTraversal(TreeNode root){

        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            root = stack.pop();
            result.add(root.value);

            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }
        }
        return result;
    }
}
