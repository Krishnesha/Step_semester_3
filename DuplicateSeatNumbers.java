import java.util.Scanner;

public class DuplicateSeatNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seat numbers: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter the seat numbers:");
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        boolean duplicate = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (seats[i] == seats[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                break;
            }
        }

        if (duplicate) {
            System.out.println("Duplicate seat number found.");
        } else {
            System.out.println("No duplicate seat numbers.");
        }

        sc.close();
    }
}