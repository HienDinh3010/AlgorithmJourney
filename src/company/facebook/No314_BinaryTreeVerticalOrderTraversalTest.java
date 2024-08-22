package company.facebook;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No314_BinaryTreeVerticalOrderTraversalTest extends No314_BinaryTreeVerticalOrderTraversal {

    No314_BinaryTreeVerticalOrderTraversal no314 = new No314_BinaryTreeVerticalOrderTraversal();

    @Test
    void testVerticalOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        List<List<Integer>> result = no314.verticalOrder(root);
        assertEquals(4, result.size());
        assertEquals(9, result.get(0).get(0));
        assertEquals(7, result.get(3).get(0));
    }

    @Test
    void testVerticalOrder2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(0);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = no314.verticalOrder(root);
        assertEquals(5, result.size());
        assertEquals(8, result.get(3).get(0));
        assertEquals(2, result.get(3).get(1));
    }
}