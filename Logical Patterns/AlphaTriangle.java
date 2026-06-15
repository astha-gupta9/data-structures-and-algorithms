import java.util.Scanner;

public class AlphaTriangle {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = rows - 1; i >= 0; i--) {     // Rows
            for (int j = i; j < rows; j++) {     // Cols
                System.out.print((char)(j + 65));
            }
            System.out.println();     // Next Row
        }
    }
}