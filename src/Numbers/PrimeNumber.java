package Numbers;

public class PrimeNumber {

    public static boolean checkPrime(int num) {
        if (num == 0 || num == 1)
            return false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        if (checkPrime(6))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }



}
