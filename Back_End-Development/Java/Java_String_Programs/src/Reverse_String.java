import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = input.nextLine();
        System.out.println("Orginal String "+str);

        String ans = reverseString(str);
        
        System.out.println("Reversed String: "+ans);

        input.close();
    }

    public static String reverseString(String str){
        char [] ch = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            char temp = ch [start];
            ch [start] = ch[end];
            ch [end] = temp;

            start++;
            end--;
        }
        return new String(ch);
    }
}