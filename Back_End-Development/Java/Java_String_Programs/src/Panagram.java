import java.util.*;

public class Panagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = input.nextLine().toLowerCase().replace(" ", "");

        String ans = isPanagram(str) ? "The given Sentence is panagram" : "The given Sentence is not a panagram";

        System.out.println(ans);
        input.close();

    }

    public static boolean isPanagram(String str){

        HashSet <Character> pan = new HashSet<Character>();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            pan.add(ch);
        }
        return pan.size() == 26;

}
}
