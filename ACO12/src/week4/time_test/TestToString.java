package week4.time_test;

import week4.sort.BubleSortTimeAction;
import week4.utils.time.time.ITimeAction;
import week4.utils.time.time.TimeCounter;

import java.util.Arrays;

/**
 * Created by 1 on 17.04.2017.
 */
public class TestToString {
    public static void main(String[] args) {
        int[] mas = new int[100_000];
        int[] copy1 = Arrays.stream(mas).map((e) -> (int) (Math.random() * 1000)).toArray();
        int[] copy2 = Arrays.copyOf(copy1, copy1.length);
        long res = TimeCounter.count(new BubleSortTimeAction(copy1));
        System.out.println("Buble sort time " + res);

        //local anonym class
        ITimeAction innerAnonymClass = new ITimeAction() {
            @Override
            public void doAction() {
                Arrays.sort(copy2);
            }
        };
        long arraysSortAnonym = TimeCounter.count(innerAnonymClass);
        System.out.println("Arrays sort time " + arraysSortAnonym);
    }
}
