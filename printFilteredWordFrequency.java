import java.util.*;

public class printFilteredWordFrequency {

    static void printFilteredWordFrequency(String feedback) {

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        feedback = feedback.toLowerCase();

        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> count = new HashMap<>();

        for (String word : words) {

            boolean isStopWord = false;

            for (String stop : stopWords) {
                if (word.equals(stop)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {

                if (count.containsKey(word)) {
                    count.put(word, count.get(word) + 1);
                } else {
                    count.put(word, 1);
                }
            }
        }

        // Print words with highest frequency first
        ArrayList<String> wordsList =
                new ArrayList<>(count.keySet());

        Collections.sort(wordsList, (a, b) ->
                count.get(b) - count.get(a));

        for (String word : wordsList) {
            System.out.println(word + ": " + count.get(word));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);
    }
}