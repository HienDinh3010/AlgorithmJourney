package binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeUtilsTest {
    TreeUtils problem;

    NumberTreeNode tree1;

    NumberTreeNode tree2;

    @BeforeEach
    public void initialize() {
        problem = new TreeUtils();

        //Initialize tree1
        tree1 = new NumberTreeNode(3);
        tree1.left = new NumberTreeNode(11);
        tree1.right = new NumberTreeNode(4);
        tree1.left.left = new NumberTreeNode(4);
        tree1.left.right = new NumberTreeNode(2);
        tree1.right.left = new NumberTreeNode(1);

        //Initialize tree2
        tree2 = new NumberTreeNode(5);
        tree2.left = new NumberTreeNode(11);
        tree2.right = new NumberTreeNode(3);
        tree2.left.left = new NumberTreeNode(4);
        tree2.left.right = new NumberTreeNode(2);
        tree2.right.right = new NumberTreeNode(1);
    }

    @Test
    public void testDFRecursive() {
        int actual = TreeUtils.treeSumDFRecursive(tree1);
        assertEquals(25, actual);
    }

    @Test
    public void testBFS() {
        int actual = TreeUtils.treeSumDFLoop(tree1);
        assertEquals(25, actual);
    }

    @Test void testMaxPathSum() {
        int actual = TreeUtils.maxPathSum(tree2);
        assertEquals(20, actual);
    }
}
