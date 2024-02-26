import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int Principle = input.nextInt();
        System.out.print("Enter Rate: ");
        int rate = input.nextInt();
        System.out.print("Enter Time: ");
        int time = input.nextInt();

        String ans = simpleInterest(Principle, rate, time);
        System.out.print(ans);
        input.close();
    }

    public static String simpleInterest(int Principle, int rate, int time) {
        int ans = (Principle * rate * time) / 100;
        return "The simple interest of given numbers  is " + ans;
    }
}