package week4.data_structure.dynamic;

import week4.data_structure.common.MyStack;
import week4.utils.time.data_structure.NodeUtils;

/**
 * Created by 1 on 31.05.2017.
 */
public class MyLinkedStack implements MyStack {
    private Node top;

    @Override
    public void push(Object obj) {
        top = new Node(obj, top);
    }

    @Override
    public Object pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }

        Object forRet = top.val;
        top = top.next;
        return forRet;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{ \n" +
                "top=" + NodeUtils.toStringRecursion(top).replaceAll("->", "\n") +
                '}';
    }


}
