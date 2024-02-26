import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = input.nextLine().toLowerCase();

        String ans = isPalindrome(str) ? "The given " + str + " is palindrome"
                : "The given " + str + " is not a palindrome";

        System.out.println(ans);

        input.close();
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        String str1 = str;
        String str2 = Reverse_String.reverseString(str);
        return (str1.equals(str2));
    }

}