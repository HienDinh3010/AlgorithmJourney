package binarytree;

import java.util.LinkedList;
import java.util.Stack;

public class TreeUtils {
    public static int treeSumDFRecursive(NumberTreeNode root) {
        if (root == null) return 0;
        return root.val + treeSumDFRecursive(root.left) + treeSumDFRecursive(root.right);
    }

    public static int treeSumDFLoop(NumberTreeNode root) {
        if (root == null) return 0;
        Stack<NumberTreeNode> stack = new Stack<>();
        stack.push(root);
        int sum = 0;
        while (!stack.isEmpty()) {
            NumberTreeNode current = stack.pop();
            sum = sum + current.val;
            if (current.left != null) stack.push(current.left);
            if (current.right != null) stack.push(current.right);
        }
        return sum;
    }

    public static int maxPathSum(NumberTreeNode root) {
        if (root == null) return Integer.MIN_VALUE;
        if (root.left == null && root.right == null) return root.val;
        int maxChild = Math.max(maxPathSum(root.left), maxPathSum(root.right));
        return root.val + maxChild;
    }
}
