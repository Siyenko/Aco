package week4.sort;

import week4.utils.time.time.ITimeAction;

/**
 * Created by 1 on 18.04.2017.
 */
public class BubleSortTimeAction implements ITimeAction{
   private int [] mas;

    public BubleSortTimeAction(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void doAction() {
        SortUtils.selectionSort(mas);
    }
}
