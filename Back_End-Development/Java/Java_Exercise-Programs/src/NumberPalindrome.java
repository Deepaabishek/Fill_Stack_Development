import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int orginalNumber = num;

        int ans = ReverseANumber.numberReverse(num);

        if (orginalNumber == ans) {
            System.out.print("The given number is palindrome");
        } else {
            System.out.print("The given number is not a palindrome");
        }
        input.close();
    }
}
