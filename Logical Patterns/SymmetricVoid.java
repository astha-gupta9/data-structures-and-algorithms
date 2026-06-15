import java.util.Scanner;

public class SymmetricVoid {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern

        // Upper-Half Pattern
        for (int i = rows; i > 0; i--) {     // Rows
            
            // Cols
            for (int j = i; j > 0; j--) {      // Print Left Half asterisks
                System.out.print("*");
            }
            for (int j = 0; j < 2 * (rows - i); j++) {     // Print spaces
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {     // Print Right Half asterisks
                System.out.print("*");
            }

            System.out.println();     // Next Row
        }

        // Lower-Half Pattern
        for (int i = 1; i <= rows; i++) {     // Rows
            
            // Cols
            for (int j = 1; j <= i; j++) {      // Print Left Half asterisks
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {     // Print spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {     // Print Right Half asterisks
                System.out.print("*");
            }

            System.out.println();     // Next Row
        }
    }
}