import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = input.nextInt();

        String ans = grade(mark);
        System.out.println(ans);

        input.close();
    }

    public static String grade(int mark) {

        if (mark > 100 || mark < 0) {
            return "Enter valid mark";
        } else if (mark == 100) {
            return "O+";
        } else if (mark >= 90) {
            return "O";
        } else if (mark >= 80) {
            return "A+";
        } else if (mark >= 70) {
            return "A";
        } else if (mark >= 60) {
            return "B+";
        } else if (mark >= 50) {
            return "B";
        } else if (mark >= 40) {
            return "JP";
        } else {
            return "Fail";
        }
    }
}
