package week4.data_structure.static_structure;

import week4.data_structure.common.MyStack;

import java.util.Arrays;

/**
 * Created by 1 on 31.05.2017.
 */
public class MyArrayStack implements MyStack {

    private Object[] mas;
    private int top;

    public MyArrayStack(int size) {
        mas = new Object[size];
    }

    @Override
    public void push(Object obj) {
        if (top == mas.length) {
            System.out.println("Stack is full");
            return;
        }
        mas[top] = obj;
        top++;
    }

    @Override
    public Object pop() {
        top--;
        Object forRet = mas[top];
        mas[top]= null;
        return forRet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = top-1; i>=0; i--){
            sb.append(mas[i]).append("\n");
        }
        return "MyArrayStack{" +
                "mas=" + sb + "}";
    }
}
