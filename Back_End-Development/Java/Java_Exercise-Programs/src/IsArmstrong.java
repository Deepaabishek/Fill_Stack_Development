import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        String ans = isArmstrong(num) ? "The given " + num + " is a armstrong number"
                : "The given " + num + " is not a armstrong number";
        System.out.println(ans);
        input.close();
    }

    public static boolean isArmstrong(int num) {
        int orginalNum = num;
        int sum = 0;
        int power = String.valueOf(num).length();
        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, power);
            num /= 10;
        }
        return sum == orginalNum;
    }
}
