import java.util.Scanner;

public class AlphaHill {
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
            for (int j = 0; j <= i; j++) {     // Print characters for left half triangle
                System.out.print((char)(j + 65));
            }
            for (int j = i - 1; j >= 0; j--) {     // Print rest characters
                System.out.print((char)(j + 65));
            }

            System.out.println();     // Next Row
        }
    }
}