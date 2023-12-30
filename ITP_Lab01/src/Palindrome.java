public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }

    }


    public static String reverseString(String s){
        char[] charS = s.toCharArray();
        String newString = "";
        for (int i = s.length()-1; i >= 0; i--){
            newString += charS[i];
        }
        return newString;
    }


    public static boolean isPalindrome(String s){
        String reversedS = reverseString(s);

        return reversedS.equals(s);

    }
}
