import java.util.Scanner;

public class DiamondStar {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern

        // Pyramid
        for (int i = 0; i < rows; i++) {     // Rows
            
            // Cols
            for (int j = 0; j < rows - i - 1; j++) {     // Print Left Spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {     // Print asterisks
                System.out.print("*");
            }

            System.out.println();     // Next Row
        }

        // Inverted Pyramid
        for (int i = rows; i > 0; i--) {     // Rows
            
            // Cols
            for (int j = 0; j <= rows - i - 1; j++) {     // Print Left Spaces
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {     // Print asterisks
                System.out.print("*");
            }

            System.out.println();     // Next Row
        }
    }
}