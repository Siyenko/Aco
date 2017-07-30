package week4.utils.time.data_structure;

import week4.data_structure.dynamic.Node;

public class NodeUtils {
    public static Node createChain(int size) {
        Node head = new Node(0, null);
        Node last = head;
        for (int i = 1; i < size; i++) {
            last.next = new Node(i, null);
            last = last.next;
        }

        return head;
    }

    public static String toStringRecursion(Node head) {
        return head != null ?
                (head.val.toString() + "->" + toStringRecursion(head.next)) : "";
    }

    public static StringBuilder toString(Node head) {

        StringBuilder sb = new StringBuilder();
        Node iter = head;
        while (iter != null) {
            sb.append(iter.val).append("->");
            iter = iter.next;
        }
        return sb;
    }
}