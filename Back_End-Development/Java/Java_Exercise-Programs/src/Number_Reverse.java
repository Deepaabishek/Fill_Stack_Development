import java.util.Scanner;

public class Number_Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        int ans = 0;
        System.out.println("Input Number: "+num);
        while (num > 0) {
            int rem = (int)num% 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        System.out.println("Reversed Number: "+ans);
        input.close();
    }
}
