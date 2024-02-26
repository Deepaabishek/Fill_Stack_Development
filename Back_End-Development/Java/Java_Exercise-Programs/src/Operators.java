import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out
                .print("Enter '+' for Addition or '-' for Subtraction or '*' for multiplication or '/' for division: ");
        char ch = input.next().charAt(0);

        int ans = basicCalculator(ch, num1, num2);
        if (ch == '+') {
            System.out.println(num1 + " + " + num2 + " = " + ans);
        } else if (ch == '-') {
            System.out.println(num1 + " - " + num2 + " = " + ans);
        }

        else if (ch == '*') {
            System.out.println(num1 + " * " + num2 + " = " + ans);
        }

        else if (ch == '/') {
            System.out.println(num1 + " / " + num2 + " = " + ans);
        } else {
            System.out.println("Enter a valid input");
        }
        input.close();
    }

    public static int basicCalculator(char ch, int num1, int num2) {
        int ans = 0;
        if (ch == '+') {
            ans = num1 + num2;
        } else if (ch == '-') {
            ans = num1 - num2;
        }

        else if (ch == '*') {
            ans = num1 * num2;
        }

        else if (ch == '/') {
            ans = num1 - num2;
        }
        return ans;
    }
}
