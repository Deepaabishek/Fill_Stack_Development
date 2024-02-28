import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        char[] ch = sentence.toCharArray();

        int ans = isVowel(ch);
        System.out.println(ans + " vowels characters Present is the given sentence");
        input.close();
    }

    public static int isVowel(char[] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}
