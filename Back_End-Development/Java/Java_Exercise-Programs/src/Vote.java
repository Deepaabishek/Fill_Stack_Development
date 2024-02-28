import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age < 0) {
            System.out.println("Please enter age '1' or '1' and above");
        }
        String ans = isEligible(age) ? "Eligible to vote" : "Not Eligible to vote";
        System.out.println(ans);
        input.close();
    }

    public static boolean isEligible(int age) {
        return age >= 18;
    }
}
