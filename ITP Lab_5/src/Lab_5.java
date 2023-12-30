import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab_5{

    public static void main(String[] args) {
        findNums("capibarashaylushay1hey2star3wars4isthebest10filmever25iam100serious0.15435itisawesome0,13245l");
        findNums("3.1415 3,1415 083 1 10 100 10000000 777");

        checkPassword("Qwerty1122284567");
        checkPassword("Qwerty12");
        checkPassword("Qwert1");
        checkPassword("qwerty1122284567");
        checkPassword("qwertyuioo");

        replaceToHtml("http://iloveitip.com https://idolabsintime.com http://helloworld.ru");

        checkIp("20.240.32.130");
        checkIp("250.230.120.404");
        checkIp("777.777.777.777");
        checkIp("45.222.22.22");
        checkIp("50.008.112.228");

        findWords("A", "Andrey, apple, angel, Algebra", false);
        findWords("A", "Andrey, apple, angel, Algebra", true);
        findWords("c", "Capibara cheese Camel carrot", true);
        findWords("c", "Capibara cheese Camel carrot", false);
    }


    public static void findNums(String inp) {
        System.out.println("Введено: " + inp);
        Pattern pattern = Pattern.compile("(\\d+\\.\\d+|\\d+\\,\\d+|[1-9]+[0-9]+|[1-9])");
        Matcher matcher = pattern.matcher(inp);
        try{
            while (matcher.find()) {
//                System.out.println(matcher.start()+ ": " + matcher.group());
                  System.out.println(matcher.group());
            }

        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println();
    }


    public static void checkPassword(String inp){
        System.out.println("Введено: " + inp);
        boolean OK = true;
        try{
            String lenPattern = ".{8,16}";
            boolean lenCheck = inp.matches(lenPattern);
            if(!lenCheck){
                OK = false;
                System.out.println("Неверная длина пароля. Пароль должен содержать от 8 до 16 символов");
            }

            String symbolPattern = "[A-Za-z0-9]*";
            boolean symbolCheck = inp.matches(symbolPattern);
            if(!symbolCheck){
                OK = false;
                System.out.println("Пароль не прошел проверку. Пароль должен состоять из латинских букв и цифр");
            }

            if(!Pattern.compile("[A-Z]").matcher(inp).find()){
                OK = false;
                System.out.println("Пароль не прошел проверку. Он должен содержать хотя бы одну заглавную букву");
            }

            if(!Pattern.compile("[0-9]").matcher(inp).find()){
                OK = false;
                System.out.println("Пароль не прошел проверку. Он должен содержать хотя бы одну цифру");
            }

            if(OK){
                System.out.println("Пароль прошел проверку");
            }
            System.out.println();

        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println();
    }


    public static void replaceToHtml(String inp) {
        System.out.println("Введено: " + inp);

        try{
            Pattern pattern = Pattern.compile("(https?://\\S+)");
            Matcher matcher = pattern.matcher(inp);
            while (matcher.find()) {
                String link = matcher.group();
                String html = "<a href=\"" + link + "\">" + link + "</a>";
                inp = inp.replace(link, html);
            }

        } catch(Exception e){
            System.out.println(e);
        }
        System.out.println(inp);
        System.out.println();
    }


    public static void checkIp(String inp) {
        System.out.println("Введено: " + inp);
        boolean OK = false;

        try{
            String pattern = "^(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$";
            OK = inp.matches(pattern);
        } catch(Exception e){
            System.out.println(e);
            return;
        }

        if(OK) {
            System.out.println("Адрес верный");
            System.out.println();
            return;
        }

        System.out.println("Адрес неверный");
        System.out.println();
    }
    
    
    public static void findWords(String inpChar, String inpText, boolean matchCase) {

        System.out.println("Введено: " + inpText);
        System.out.println("Символ: " + inpChar + " Учитывать регистр? " + String.valueOf(matchCase));

        String pattern1, pattern2;

        pattern1 = "\\b" + inpChar + "\\w+\\b";

        if(!matchCase){
            matchPattern(pattern1, inpText);

            if (inpChar.toLowerCase() == inpChar){
                inpChar = inpChar.toUpperCase();
            }
            else {inpChar = inpChar.toLowerCase();}

            pattern2 = "\\b" + inpChar + "\\w+\\b";

            matchPattern(pattern2, inpText);

        } else{
            matchPattern(pattern1, inpText);
        }
        System.out.println();
    }

    public static void matchPattern(String strPattern, String inpText){
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(inpText);
        try{
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}