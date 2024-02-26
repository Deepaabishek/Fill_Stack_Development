import java.util.Scanner;

public class GreatestOfNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = greatestNumber(input);
        System.out.println("The greatest of all numbers is: " + ans);
    }

    public static int greatestNumber(Scanner input) {
        int max = 0;
        while (true) {
            System.out.print("Enter a number or '0' to stop: ");
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
