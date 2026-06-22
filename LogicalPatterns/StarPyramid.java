import java.util.*;

public class StarPyramid {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
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
    }
}