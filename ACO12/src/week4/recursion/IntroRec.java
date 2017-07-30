package week4.recursion;

/**
 * Created by 1 on 04.05.2017.
 */
public class IntroRec {
    public static void main(String[] args) {
        System.out.println(a4(10));
    }

    //infinite recursion, StackOverflow
    public static void a1(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        a1(num);
    }

    public static void a2(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        a2(num - 1);
    }

    public static int a4(int num) {
        if (num == 0) {
            return 1;
        }
        int returnValue = a4(num - 2);
        return returnValue + 1;
    }
}
