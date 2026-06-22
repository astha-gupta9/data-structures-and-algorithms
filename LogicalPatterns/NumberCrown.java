import java.util.Scanner;

public class NumberCrown {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = 1; i <= rows; i++) {     // Rows
            
            // Cols
            for (int j = 1; j <= i; j++) {     // Left Triangle
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * (rows - i); j++) {     // Spaces
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) { // Right Triangle
                System.out.print(j);
            }

            System.out.println();     // Next Row
        }
    }
}