package week4.utils.time.time;

import week4.utils.time.time.ITimeAction;

/**
 * Created by 1 on 18.04.2017.
 */
public class TimeCounter {

    public static long count(ITimeAction action) {

        long start = System.currentTimeMillis();

        action.doAction();

        long end = System.currentTimeMillis();

        return end - start;
    }
}
