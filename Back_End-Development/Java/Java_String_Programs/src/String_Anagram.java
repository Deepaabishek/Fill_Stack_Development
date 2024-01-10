import java.util.*;

public class String_Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String str1 = input.nextLine().toLowerCase();
        System.out.print("Enter string2: ");
        String str2 = input.nextLine().toLowerCase();

        String ans = isAnagram(str1, str2) ? "The given words are anagram" : "The given words are not a anagram" ;

        System.out.println(ans);

        input .close();
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i = 0; i < ch1.length; i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }

        return true;
    }
}
