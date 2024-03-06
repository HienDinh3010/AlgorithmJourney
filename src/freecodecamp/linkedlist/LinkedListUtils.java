package freecodecamp.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedListUtils<T> {

    static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    static void printLinkedListRecursive(Node head) {
        if (head == null) return;
        System.out.print(head.val + " ");
        printLinkedListRecursive(head.next);
    }

    static <T> List<T> linkedListValues(Node<T> head) {
        Node<T> current = head;
        List<T> list = new ArrayList<>();
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        return list;
    }

    static <T> List<T> linkedListValueRecursive(Node<T> head) {
        List<T> values = new ArrayList<>();
        fillValues(head, values);
        return values;
    }

    private static <T> void fillValues(Node<T> node, List<T> values) {
        if (node == null) return;
        values.add(node.val);
        fillValues(node.next, values);
    }

    static <T> int linkedListSum(Node<T> head) {
        int sum = 0;
        Node current = head;
        while (current != null) {
            sum = sum + (Integer) current.val;
            current = current.next;
        }
        return sum;
    }

    static <T> int linkedListSumRecursive(Node<T> head) {
        if (head == null) return 0;
        return (Integer) head.val + linkedListSumRecursive(head.next);
    }


    public static <T> boolean isContains(Node<T> head, T val) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.val == val) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public static <T> boolean isContainsRecursive(Node<T> head, T val) {
        if (head == null) return false;
        if (head.val == val) return true;
        return isContainsRecursive(head.next, val);
    }

    public static <T> T getNodeVal(Node<T> head, int index) {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            if (count == index) return current.val;
            count++;
            current = current.next;
        }
        return null;
    }

    public static <T> T getNodeValRecursive(Node<T> head, int index) {
        if (head == null) return null;
        if (index == 0) return head.val;
        return getNodeValRecursive(head.next, index - 1);
    }

    public static <T> Node<T> revertTheOrder(Node<T> head) {
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null) {
            Node<T> next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static <T> Node<T> revertTheOrderRecursive(Node<T> head, Node<T> prev) {
        if (head == null) return prev;
        Node<T> next = head.next;
        head.next = prev;
        return revertTheOrderRecursive(next, head);
    }
}
