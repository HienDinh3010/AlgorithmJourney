package leetcode.topinterview150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No104_MaximumDepthOfBinaryTreeTest {
    No104_MaximumDepthOfBinaryTree problem;

    TreeNode root1;

    @BeforeEach
    public void initialize() {
        problem = new No104_MaximumDepthOfBinaryTree();
        //root1 =
        //[0,2,4,1,null,3,-1,5,1,null,6,null,8]
        root1 = new TreeNode(0);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(4);
        root1.left.left = new TreeNode(1);
        root1.right.left = new TreeNode(3);
        root1.right.right = new TreeNode(-1);
        root1.left.left.right = new TreeNode(5);
        root1.right.left.right = new TreeNode(6);
        root1.right.right.right = new TreeNode(8);
    }

    @Test
    public void testDFS() {
        int actual = problem.maxDepthDFS(root1);
        assertEquals(4, actual);
    }

    @Test
    public void testBFS() {
        int actual = problem.maxDepthBFS(root1);
        assertEquals(4, actual);
    }

    @Test
    public void testBFSStack() {
        int actual = problem.maxDepthBFSStack(root1);
        assertEquals(4, actual);
    }
}
