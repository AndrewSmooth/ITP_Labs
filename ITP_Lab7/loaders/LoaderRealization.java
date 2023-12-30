package lab7.loaders;

import java.util.ArrayList;

public class LoaderRealization {
    private ArrayList<Integer> stage;
    private Integer currentWeight;

    public LoaderRealization(ArrayList<Integer> stage) {
        this.stage = stage;
        currentWeight = 0;
    }


    public void run(Integer id) {
        scope: while (!stage.isEmpty()) {

            synchronized (this) { //блок может выполняться одновременно только 1 потоком
                do {
                    if (stage.isEmpty()) {
                        break scope;
                    }
                    if (currentWeight + stage.get(stage.size() - 1) <= 150) {

                        currentWeight += stage.remove(stage.size() - 1);
                        System.out.println("Рабочий " + id + " взял товар");
                        System.out.println("осталось перенести " + stage.size() + "товаров");

                        break;
                    } else {
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                } while (true);
            }
            try {
                System.out.println("Рабочий " + id + " несет товар");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            currentWeight = 0;
            System.out.println("Рабочий " + id + " доставил товар");
        }
    }
}

