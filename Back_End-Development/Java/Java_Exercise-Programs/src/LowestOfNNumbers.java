import java.util.Scanner;

public class LowestOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = lowestOfNumbers(input);
        System.out.println("The minimum of given numbers is: " + ans);
    }

    public static int lowestOfNumbers(Scanner input) {
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter a number or 0 to stop: ");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
