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
/*        if (head == null) return 0;
        return (Integer) head.val + linkedListSumRecursive(head.next);*/
        Integer sum = 0;
        sumValues(head, sum);
        return sum;
    }

    private static <T> void sumValues(Node<T> node, Integer sum) {
        if (node == null) return;
        sum = sum + (Integer) node.val;
        sumValues(node.next, sum);
    }
}
