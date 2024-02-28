import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no of inputs: ");
        int num = input.nextInt();

        double ans = averageOfNumbers(num, input);
        System.out.println("The average of N numbers: " + ans + " ");
        input.close();
    }

    public static double averageOfNumbers(int num, Scanner input) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter " + i + " number: ");
            int num1 = input.nextInt();
            sum += num1;
        }

        return (double) sum / num;
    }
}
