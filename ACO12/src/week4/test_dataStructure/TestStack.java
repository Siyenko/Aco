package week4.test_dataStructure;

import week4.data_structure.common.MyStack;
import week4.data_structure.dynamic.MyLinkedStack;
import week4.data_structure.static_structure.MyArrayStack;

/**
 * Created by 1 on 31.05.2017.
 */
public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyLinkedStack();

        for (int i = 0; i < 7; i++) {
            stack.push(i);
        }

        System.out.println(stack);
    }
}
