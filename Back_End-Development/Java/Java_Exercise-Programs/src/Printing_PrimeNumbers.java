import java.util.Scanner;

public class Printing_PrimeNumbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter anumber: ");
        int num = input.nextInt();
        
        printPrimeNumbers(num);

        input.close();
    }

    public static void printPrimeNumbers(int limit){
        for(int i = 2; i <= limit; i++){
            if(Prime_Numbers.isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
