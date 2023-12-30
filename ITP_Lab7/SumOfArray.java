package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.*;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 8, 3, 5, 6, 1, 2, 3, 6};
        int sum = sumOfArray(array);
        System.out.println(sum);
    }

    public static int sumOfArray(int[] array) {
        int count = array.length / 4 + 1;
        int sum = 0;
        if (count > 1) { //Если массив не пустой
            ExecutorService service  = Executors.newFixedThreadPool(count); //создаем несколько потоков
            ArrayList<Future<Integer>> futures = new ArrayList<>(); //future - синхронизация уже обработанных операций
            for (int i = 0; i < count; i++) {
                int[] slice = Arrays.copyOfRange(array,i * count, (i+1) * count); //Для каждого потока свой разрез
                futures.add(service.submit(new SumOfArrayCallable(slice)));
            }
            if (array.length % 4 != 0) {
                int[] slise = Arrays.copyOfRange(array, 4 * (count - 1) + 1, array.length); //Если длина массива не делится на четыре, то запускаем в поток оставшуюся часть массива
                futures.add(service.submit(new SumOfArrayCallable(slise)));
            }
            for (int i = 0; i < futures.size(); i++) {
                try {
                    sum += futures.get(i).get(); //суммируем значения потоков
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println(e.getMessage());
                }
            }
            service.close();
            return sum;
        } else { //если массив не дел. на 4
            for (int i : array) {
                sum += i;
            }
        }
        return sum;
    }
}
