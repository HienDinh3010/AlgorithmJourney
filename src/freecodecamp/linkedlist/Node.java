package freecodecamp.linkedlist;

import java.util.List;
import java.util.Optional;

public class Node<T> {

    T val;

    Node<T> next;

    Node(T val) {
        this.val = val;
        this.next = null;
    }


    public static void main(String[] args) {
        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        a.next = b;
        b.next = c;
        c.next = d;
        LinkedListUtils.printLinkedList(a);
        System.out.println();
        LinkedListUtils.printLinkedListRecursive(a);
        System.out.println();
        Optional.ofNullable(
                LinkedListUtils.linkedListValues(a)).ifPresent(val -> System.out.print(val + " "));
        System.out.println();
        Optional.ofNullable(
                LinkedListUtils.linkedListValueRecursive(a)).ifPresent(val -> System.out.print(val + " "));
        System.out.println();
        Node<Integer> num = new Node<>(1);
        Node<Integer> num2 = new Node<>(2);
        Node<Integer> num3 = new Node<>(3);
        Node<Integer> num4 = new Node<>(4);
        num.next = num2;
        num2.next = num3;
        num3.next = num4;
        System.out.println(LinkedListUtils.linkedListSum(num));
        System.out.println(LinkedListUtils.linkedListSumRecursive(num));
    }
}
