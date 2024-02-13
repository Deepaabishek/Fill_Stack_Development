import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Year: ");
        int year = input.nextInt();

        String ans = findLeapYear(year) ? "The Given " + year + " is a Leap Year"
                : "The Given " + year + " is not a Leap Year";

        System.out.println(ans);
        input.close();
    }

    public static boolean findLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}
