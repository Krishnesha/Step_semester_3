import java.util.Scanner;

public class WarehouseInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of product categories: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        int totalA = 0, totalB = 0;
        int highest = Integer.MIN_VALUE;

        System.out.println("\nEnter quantities for Section A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Product " + (i + 1) + ": ");
            sectionA[i] = sc.nextInt();
            totalA += sectionA[i];

            if (sectionA[i] > highest) {
                highest = sectionA[i];
            }
        }

        System.out.println("\nEnter quantities for Section B:");
        for (int i = 0; i < n; i++) {
            System.out.print("Product " + (i + 1) + ": ");
            sectionB[i] = sc.nextInt();
            totalB += sectionB[i];

            if (sectionB[i] > highest) {
                highest = sectionB[i];
            }
        }

        System.out.println("\nTotal Quantity in Section A: " + totalA);
        System.out.println("Total Quantity in Section B: " + totalB);

        if (totalA == totalB) {
            System.out.println("Both sections have matching total quantities.");
        } else {
            System.out.println("Mismatch in total quantities between the two sections.");
        }

        System.out.println("Highest quantity item in the warehouse: " + highest);

        sc.close();
    }
}