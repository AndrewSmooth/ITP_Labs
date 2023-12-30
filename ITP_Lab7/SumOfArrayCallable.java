package lab7;

import java.util.concurrent.Callable;

public class SumOfArrayCallable implements Callable<Integer> {

    private final int[] slice;

    public SumOfArrayCallable(int[] slice) { //Суммируем элементы переданного массива
        this.slice = slice;
    }
    public Integer call() {
        int sum = 0;
        for (int i : slice) {
            sum += i;
        }
        return sum;
    }
}
