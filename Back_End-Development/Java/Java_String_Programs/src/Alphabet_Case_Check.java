import java.util.Scanner;

public class Alphabet_Case_Check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        if(ch >= 65 && ch<=90){
            System.out.println("The given "+ch+" is Upper Case");
        }

        else if(ch >= 97 && ch<=122){
             System.out.println("The given "+ch+" is Lower Case");

        }

        else{
            System.out.println("Enter only Alphabets");
        }

        input.close();
    }
}

