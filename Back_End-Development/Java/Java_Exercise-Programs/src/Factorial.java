import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        long ans = factorial(num);
        System.out.println("The factorial of given number is: " + ans);
        input.close();
    }

    public static long factorial(int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }
}
