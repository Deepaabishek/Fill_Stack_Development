import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = sumOfNumbers(input);
        System.out.println("Sum of negative numbers: " + arr[0]);
        System.out.println("Sum of positive even numbers: " + arr[1]);
        System.out.println("Sum of positive odd numbers: " + arr[2]);
    }

    public static int[] sumOfNumbers(Scanner input) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int[] arr = new int[3];
        while (true) {
            System.out.print("Enter a number or 'o' to stop: ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }
            if (num < 0) {
                sum1 += num;
                arr[0] = sum1;
            } else if (num % 2 == 0) {
                sum2 += num;
                arr[1] = sum2;
            } else if (num % 2 != 0) {
                sum3 += num;
                arr[2] = sum3;
            }
        }
        return arr;
    }
}
