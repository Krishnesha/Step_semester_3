import java.util.Scanner;

public class TypingAccuracy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the original passage:");
        String original = sc.nextLine();

        System.out.println("Enter the typed passage:");
        String typed = sc.nextLine();

        int minLength = Math.min(original.length(), typed.length());
        int correct = 0;
        int firstMistake = -1;

        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                correct++;
            } else {
                if (firstMistake == -1) {
                    firstMistake = i + 1; // Position starts from 1
                }
            }
        }

        // Accuracy based on original passage length
        double accuracy = (double) correct / original.length() * 100;

        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        if (firstMistake == -1) {
            if (original.length() == typed.length()) {
                System.out.println("No mistakes found.");
            } else {
                System.out.println("First mistake at position: " + (minLength + 1));
            }
        } else {
            System.out.println("First mistake at position: " + firstMistake);
        }

        sc.close();
    }
}