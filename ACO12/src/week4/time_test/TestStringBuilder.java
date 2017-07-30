package week4.time_test;

import week4.utils.time.time.ITimeAction;
import week4.utils.time.time.TimeCounter;

/**
 * Created by 1 on 20.04.2017.
 */
public class TestStringBuilder {
    public static void main(String[] args) {

        int count = 10_000;
        long time = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                String res = "";
                for (int i = 0; i < count; i++) {
                    res = res + i;
                }
            }
        });
        System.out.println("String count " + time);

        long strBuilderConc = TimeCounter.count(new ITimeAction() {
            @Override
            public void doAction() {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    sb.append(i);
                }
            }
        });
        System.out.println("String builder time " + strBuilderConc);
    }
}
