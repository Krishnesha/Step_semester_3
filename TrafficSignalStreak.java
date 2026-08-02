import java.util.Scanner;

public class TrafficSignalStreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the traffic signal log: ");
        String log = sc.nextLine();

        if (log.length() == 0) {
            System.out.println("Log is empty.");
            return;
        }

        char maxColor = log.charAt(0);
        int maxStreak = 1;

        char currentColor = log.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < log.length(); i++) {
            if (log.charAt(i) == currentColor) {
                currentStreak++;
            } else {
                currentColor = log.charAt(i);
                currentStreak = 1;
            }

            if (currentStreak > maxStreak) {
                maxStreak = currentStreak;
                maxColor = currentColor;
            }
        }

        System.out.println("Longest streak color: " + maxColor);
        System.out.println("Longest streak length: " + maxStreak);

        sc.close();
    }
}