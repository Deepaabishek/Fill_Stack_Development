import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("Factors of given " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (factors(num, i)) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }

    public static boolean factors(int n, int num) {
        return n % num == 0;
    }
}
