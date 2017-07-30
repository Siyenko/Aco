package week4.seach;

/**
 * Created by 1 on 11.04.2017.
 */
public class LinearSeach {
    public static int indexOf(int[] mas, int key) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
