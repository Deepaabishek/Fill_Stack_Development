import java.util.Scanner;

public class Maximum_And_Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter num3: ");
        int num3 = input.nextInt();
        
        int max = findmaximum(num1, num2, num3);
        int min = findminimum(num1, num2, num3);
        
        System.out.println("The maximum value = "+max);
        System.out.println("The minimum value = "+min);

        input.close();
    }    

    public static int findmaximum (int num1, int num2, int num3){
        int max = num1;
        if(num2>max){
            max = num2;
        }

        if(num3>max){
            max = num3;
        }
        return max;
    }

    public static int findminimum (int num1, int num2, int num3){
        int min = num1;
        if(num2<min){
            min = num2;
        }

        if(num3<min){
            min = num3;
        }
        return min;
    }
}
