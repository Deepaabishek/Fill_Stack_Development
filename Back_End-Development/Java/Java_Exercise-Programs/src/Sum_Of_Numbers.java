import java.util.Scanner;

public class Sum_Of_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = getSum(input);

        System.out.println("The sum of given numbers is " + sum);
        input.close();
    }

    public static int getSum(Scanner input) {
        int sum = 0;
        while (true) {
            System.out.print("Enter a number or x to stop: ");
            String str = input.nextLine();

            if (str.equals("x") || str.equals("X")) {
                break;
            }
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}
