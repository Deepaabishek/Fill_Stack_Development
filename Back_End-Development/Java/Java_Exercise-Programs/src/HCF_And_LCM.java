import java.util.Scanner;

public class HCF_And_LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        int hcf = findHCF(num1, num2);
        System.out.println("Hcf of " + num1 + " and " + num2 + " is: " + hcf);

        int lcm = findLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        input.close();
    }

    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int findLCM(int num1, int num2) {
        return Math.abs(num1 * num2) / findHCF(num1, num2);
    }
}
