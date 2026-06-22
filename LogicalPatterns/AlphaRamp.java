import java.util.Scanner;

public class AlphaRamp {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = 0; i < rows; i++) {     // Rows
            for (int j = 0; j <= i; j++) {     // Cols
                System.out.print((char)(i + 65) + " ");     // Print
            }
            System.out.println();     // Next Row
        }
    }
}