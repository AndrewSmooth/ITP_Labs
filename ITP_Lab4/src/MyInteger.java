import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class MyInteger {//создаем класс MyInteger и метод в нём, выдающий ошибку, если нельщя преобразовать строку в число
    public static int parseInt(String str) throws CustomNumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new CustomNumberFormatException("Exception!");
        }
    }
}
class CustomNumberFormatException extends NumberFormatException {
    public CustomNumberFormatException(String message) {
        super(message);
        File file = new File("/home/andrey/IdeaProjects/ITP_Lab4/src/Text3.txt");
        try{
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write(message);
            filewriter.append("\n");
            filewriter.close();
        } catch (Exception e){
            e.getMessage();
        }
        }
    }
