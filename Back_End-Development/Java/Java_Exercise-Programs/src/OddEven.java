import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String ans = "";
        if (num <= 0) {
            System.out.println("Enter 1 And above");
        } else {
            ans = oddEven(num) ? "The given number is even" : "The given number is odd";
        }
        System.out.println(ans);
        input.close();
    }

    public static boolean oddEven(int num) {
        return (num % 2 == 0);
    }
}
