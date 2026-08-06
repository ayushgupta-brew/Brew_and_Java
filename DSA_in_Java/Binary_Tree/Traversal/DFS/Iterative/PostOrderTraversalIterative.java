package Binary_Tree.Traversal.DFS.Iterative;

import Binary_Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversalIterative {
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

        // Get postorder traversal result
        List<Integer> answerUsingTwoStack = postorderTraversalUsingOneStack(root);
        List<Integer> answerUsingOneStack = postorderTraversalUsingOneStack(root);

        // Print output
        System.out.println(answerUsingOneStack);
        System.out.println(answerUsingTwoStack);
    }

    // Iterative Postorder Traversal using TWO stack
    // Postorder order = Left -> Right -> Root
    public static List<Integer> postorderTraversal(TreeNode root) {

        // Stores final postorder result
        List<Integer> result = new ArrayList<>();

        // If tree is empty, return empty list
        if (root == null) {
            return result;
        }

        // stack1 is used to process nodes
        // stack2 is used to store nodes in reverse postorder
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        // Start with root in stack1
        stack1.push(root);

        // Process all nodes
        while (!stack1.isEmpty()) {

            // Remove one node from stack1
            TreeNode currentNode = stack1.pop();

            // Push it into stack2
            // This reverses the order so we get postorder at the end
            stack2.push(currentNode);

            // Push left child first
            // then right child
            // so that right child is processed before left child
            if (currentNode.left != null) {
                stack1.push(currentNode.left);
            }

            if (currentNode.right != null) {
                stack1.push(currentNode.right);
            }
        }

        // Pop from stack2 to get final postorder sequence
        while (!stack2.isEmpty()) {
            result.add(stack2.pop().value);
        }

        return result;
    }


    // Iterative Postorder Traversal using ONE stack
    // Postorder order = Left -> Right -> Root
    public static List<Integer> postorderTraversalUsingOneStack(TreeNode root) {

        // Final result list
        List<Integer> result = new ArrayList<>();

        // If tree is empty, return empty list
        if (root == null) {
            return result;
        }

        // Stack stores nodes while we traverse down the tree
        Stack<TreeNode> stack = new Stack<>();

        // lastVisited keeps track of the last node that was fully processed
        TreeNode lastVisited = null;

        // Start from the root
        TreeNode current = root;

        // Continue until all nodes are processed
        while (current != null || !stack.isEmpty()) {

            // Go as far left as possible
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {

                // Look at the node on top of the stack
                TreeNode peekNode = stack.peek();

                // If right child exists and is not processed yet,
                // then move to the right subtree
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    // Both left and right subtrees are done
                    // so now visit the node
                    result.add(peekNode.value);

                    // Mark this node as visited
                    lastVisited = stack.pop();
                }
            }
        }

        return result;
    }
}
