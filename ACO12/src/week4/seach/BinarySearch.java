package week4.seach;

/**
 * Created by 1 on 12.04.2017.
 */
public class BinarySearch {
    public static int BinaryIndexOf(int[] mas, int key) {
        int start = 0;
        int end = mas.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (key < mas[mid]) {
                end = mid - 1;
            } else if (key > mas[mid]) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
