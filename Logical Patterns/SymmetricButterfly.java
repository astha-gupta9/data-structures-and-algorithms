import java.util.Scanner;

public class SymmetricButterfly {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern

        // Upper Half
        for (int i = 1; i <= rows; i++) {     // Rows

            // Cols
            for (int j = 1; j <= i; j++) {     // Print left asterisks
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {     // Print spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {     // Print right asterisks
                System.out.print("*");
            }

            System.out.println();     // Next Row
        }

        // Lower Half
        for (int i = rows - 1; i > 0; i--) {     // Rows

            // Cols
            for (int j = 1; j <= i; j++) {     // Print left asterisks
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {     // Print spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {     // Print right asterisks
                System.out.print("*");
            }

            System.out.println();     // Next Row
        }
    }
}