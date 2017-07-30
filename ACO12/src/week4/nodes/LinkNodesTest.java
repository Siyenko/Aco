package week4.nodes;

import week4.data_structure.dynamic.Node;
import week4.utils.time.data_structure.NodeUtils;

/**
 * Created by 1 on 11.05.2017.
 */
public class LinkNodesTest {
    public static void main(String[] args) {
        //test1();

        // test3();
        Node head = NodeUtils.createChain(10);
        System.out.println(NodeUtils.toString(head));
        System.out.println(NodeUtils.toStringRecursion(head));
    }

    private static void test3() {
        Node head = new Node(1, null);
        for (int i = 0; i < 10; i++) {
            head = new Node(i, head);
        }
    }

    private static void test1() {
        Node head = new Node(1, null);
        Node second = new Node(2, head);
        Node third = new Node(3, second);
    }
}
