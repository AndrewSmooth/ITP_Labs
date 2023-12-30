import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class CopyFile {
    public static void main(String[] args) {
        String path1 = "/home/andrey/IdeaProjects/ITP_Lab4/src/Text1.txt";
        String path2 = "/home/andrey/IdeaProjects/ITP_Lab4/src/Text2.txt";

        File file1;
        File file2;

        try {
            file1 = new File(path1);//объявляем файлы
            file2 = new File(path2);

            FileWriter f1 = new FileWriter(file2, true); //создаем FileWriter для записи в файл

            Scanner scanner = new Scanner(file1); //создаем  Scanner для file1
            ArrayList<String> arr = new ArrayList<>();

            while (scanner.hasNextLine()) { //сканируем каждую строку файла 1 и копируем их в массив
                arr.add(scanner.nextLine());
            }
            scanner.close(); //освобождаем сканер

            for (int i = 0; i < arr.size(); i++) { //записываем каждую строку из массива в файл2
                f1.append(arr.get(i));
                f1.append("\n");
            }
            f1.close();
            f1.flush(); //удаляем записанне данные
            f1.close(); //освобождаем FileWriter

        }
        catch(FileNotFoundException e) {
            System.out.println("Files chosen incorrect");
        }
        catch(IOException f) {
            System.out.println("Input and output incorrect");
        }
    }
}