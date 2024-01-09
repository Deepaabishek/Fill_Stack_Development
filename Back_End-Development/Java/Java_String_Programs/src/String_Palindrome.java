import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = input.nextLine().toLowerCase();

        String ans = ispalindrome(str) ? "The given "+str+" is palindrome" : "The given "+str+" is not a palindrome";

        System.out.println(ans);

        input.close();
    }

    public static boolean ispalindrome(String str){
        if(str == null || str.length() == 0){
            return true;
        }
        for(int i = 0; i <= str.length() / 2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
    
}