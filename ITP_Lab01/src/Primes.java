public class Primes {
    public static void main(String[] args) {
        for (int num = 2; num < 701; num++){
            if (isPrime(num)){
                System.out.println(num);
            }
        }
    }


    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
