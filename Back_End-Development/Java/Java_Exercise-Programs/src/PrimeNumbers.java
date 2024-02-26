import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int start = 2;
        int number = 2;

        // IsPrime prime = new IsPrime();
        System.out.print("Prime numbers of " + num + ": ");
        for (int i = 1; i <= num;) {
            if (isPrime(start, number)) {
                System.out.print(" " + number);
                i++;
            }
            number++;
        }
        input.close();
    }

    public static boolean isPrime(int start, int num) {
        if (num == start) {
            return true;
        }

        for (int i = start; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
