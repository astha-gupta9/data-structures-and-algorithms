import java.util.Scanner;

public class ReverseLetterTriangle {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = rows; i > 0; i--) {     // Rows
            for (int j = 0; j < i; j++) {     // Cols
                System.out.print((char)(j + 65) + " ");     // Print
            }
            System.out.println();     // Next Row
        }
    }
}