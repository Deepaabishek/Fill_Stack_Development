import java.util.Scanner;

public class RupeesToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rupees: ");
        int rupees = input.nextInt();

        double ans = rupeesToDollar(rupees);
        System.out.println(ans + " Dollars");
        input.close();
    }

    public static double rupeesToDollar(int rupees) {
        double ans = rupees * 0.012;
        return ans;
    }
}
