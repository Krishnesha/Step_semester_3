import java.util.Scanner;

public class MovieReviewAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a movie review:");
        String review = sc.nextLine();

        String[] words = review.split("\\s+");

        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        System.out.println("\nWord Lengths:");

        for (String word : words) {
            // Remove punctuation
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() == 0)
                continue;

            System.out.println(word + " : " + word.length());

            if (word.length() <= 3)
                shortWords++;
            else if (word.length() <= 7)
                mediumWords++;
            else
                longWords++;
        }

        System.out.println("\nWord Length Breakdown:");
        System.out.println("Short Words (1-3 letters): " + shortWords);
        System.out.println("Medium Words (4-7 letters): " + mediumWords);
        System.out.println("Long Words (8 or more letters): " + longWords);

        sc.close();
    }
}