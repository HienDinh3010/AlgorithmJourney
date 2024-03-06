package leetcode.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadFirstValues {
    public static List<Object> breadFirstValues(TreeNode root) {
        List<Object> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            list.add(current.val);
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        return list;
    }

    public static boolean treeIncludes(TreeNode root, Object target) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.val.equals(target)) return true;
            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode tree2 = new TreeNode("a");
        tree2.left = new TreeNode("b");
        tree2.left.left = new TreeNode("d");
        tree2.left.right = new TreeNode("e");

        tree2.right = new TreeNode("c");
        tree2.right.left = new TreeNode(null);
        tree2.right.right = new TreeNode("f");
        boolean finding = treeIncludes(tree2, "e");
        System.out.println("Finding " + finding);
        System.out.println("-----");
        TreeNode tree3 = new TreeNode("a");
        tree3.left = new TreeNode("b");
        tree3.right = new TreeNode("c");

        tree3.left.left = new TreeNode("d");
        tree3.left.right = new TreeNode("e");
        tree3.left.right.left = new TreeNode("g");

        tree3.right.right = new TreeNode("f");
        tree3.right.right.right = new TreeNode("h");
        System.out.println("Finding on tree3 " + treeIncludes(tree3, "i"));
    }
}
