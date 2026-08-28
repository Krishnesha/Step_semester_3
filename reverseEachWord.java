import java.util.Scanner;

public class reverseEachWord {

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reverse = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }

            result = result + reverse;

            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.println(reverseEachWord(sentence));
    }
}