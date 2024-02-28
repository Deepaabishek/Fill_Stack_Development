import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int[] power = new int[arr.length];

        for (int k = 0; k < power.length; k++) {
            power[k] = (int) Math.pow(arr[k], 2);
        }
        System.out.print("Pythagorean Triplet Found: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = 0; l < arr.length; l++) {
                    if (pythagoreanTriplet(power[i], power[j], power[l])) {
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[l]);
                    }
                }
            }
        }
        input.close();
    }

    public static boolean pythagoreanTriplet(int a, int b, int c) {
        return a + b == c;
    }
}
