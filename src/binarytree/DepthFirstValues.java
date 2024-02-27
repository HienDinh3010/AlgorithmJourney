package binarytree;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DepthFirstValues {
    public static List<Object> depthFirstValues(TreeNode root) {
        List<Object> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.println(current.val);
            list.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return list;
    }

    public static List<Object> depthFirstValues2(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Object> left = depthFirstValues2(root.left);
        List<Object> right = depthFirstValues2(root.right);
        return Stream.of(Arrays.asList(root.val), left, right)
                .flatMap(Collection::stream).collect(Collectors.toList());
    }

    public static boolean treeIncludes(TreeNode root, Object target) {
        if (root == null) return false;
        if (root.val == target) return true;
        return treeIncludes(root.left, target) || treeIncludes(root.right, target);
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(3);
        tree1.left = new TreeNode(9);
        tree1.right = new TreeNode(20);
        tree1.right.right = new TreeNode(15);
        tree1.right.left = new TreeNode(7);
        depthFirstValues(tree1);
        System.out.println("------");
        List<Object> list = depthFirstValues2(tree1);
        list.stream().forEach(i -> System.out.println(i));
        System.out.println("----");
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
