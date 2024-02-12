package leetcode.topinterview150;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class No104_MaximumDepthOfBinaryTree {

    public int maxDepthDFS(TreeNode root) {
        if (root == null) return 0;
        return Integer.max(maxDepthBFS(root.left), maxDepthDFS(root.right)) + 1;
    }

    //BFS counting number of levels
    public int maxDepthBFS(TreeNode root) {
        if (root == null) return 0;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            level += 1;
        }

        return level;
    }

    public int maxDepthBFSStack(TreeNode root) {
        Stack<Object[]> stack = new Stack<>();
        stack.push(new Object[] {root, 1});
        int res = 0;
        while (!stack.isEmpty()) {
            Object[] pair = stack.pop();
            TreeNode node = (TreeNode) pair[0];
            int depth = (int) pair[1];
            if (node != null) {
                res = Math.max(res, depth);
                stack.push(new Object[]{node.left, depth + 1});
                stack.push(new Object[]{node.right, depth + 1});
            }
        }
        return res;
    }
}
