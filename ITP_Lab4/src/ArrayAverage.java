public class ArrayAverage {

    public static void main (String[] args) {
        Object[] obj = {};
        int l = obj.length;
        try{
            System.out.println(averSumm(obj, 0) / l);
        }
        catch(ClassCastException e) {
            System.out.println("There is no int array");
        }
        catch(ArrayIndexOutOfBoundsException f) {
            System.out.println("You out of your bounds");
        }
        catch(ArithmeticException g) {
            System.out.println("devided by zero");
        }
    }

    public static int averSumm (Object[] obj, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += (int) obj[i];
        }
        return sum;
    }
}