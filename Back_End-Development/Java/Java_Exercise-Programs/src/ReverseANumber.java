import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Orginal number: " + num);
        int ans = numberReverse(num);
        System.out.println("Reversed number: " + ans);

        input.close();
    }

    public static int numberReverse(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        return ans;
    }
}
