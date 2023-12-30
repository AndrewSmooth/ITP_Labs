public class Main {
    public static void main(String[] args) {
        String str = "abc";
        try {
            Integer num = MyInteger.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
