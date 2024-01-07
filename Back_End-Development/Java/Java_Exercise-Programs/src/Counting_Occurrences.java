import java.util.Scanner;

public class Counting_Occurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        System.out.print("Enter the number to be checked: ");
        int num1 = input.nextInt();
        long count =0;
        while (num > 0) {
            long rem = num % 10;
            if (rem == num1) {
                count++;
            }
                num /=10;
        }
        System.out.println(count);
        input.close();
    }
}
