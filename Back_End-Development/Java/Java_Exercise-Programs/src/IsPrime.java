import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int start = 2;
        if (num > 1) {
            String ans = isPrime(num, start) ? "The given " + num + " is a prime number"
                    : "The given " + num + " is not a prime number";
            System.out.println(ans);
        } else {
            System.out.println("Enter number 2 or above");
        }
        input.close();
    }

    public static boolean isPrime(int num, int start) {
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
