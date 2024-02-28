import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = input.nextInt();

        double ans = averageMarks(subjects, input);
        System.out.println("The avergae mark: " + ans);
    }

    public static double averageMarks(int subjects, Scanner input) {
        int sum = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter subject " + i + "mark: ");
            int mark = input.nextInt();

            sum += mark;
        }
        return (double) sum / subjects;
    }
}
