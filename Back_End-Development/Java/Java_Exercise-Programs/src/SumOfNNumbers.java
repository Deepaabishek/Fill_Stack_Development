import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = sumOfNumbers(input);
        System.out.println("The sum of give numbers: " + ans);
    }

    public static int sumOfNumbers(Scanner input) {
        int sum = 0;
        System.out.print("Enter the numbers: ");

        while (true) {
            int num = input.nextInt();

            if (num == 0) {
                break;
            } else {
                sum += num;
            }
        }
        return sum;
    }
}
