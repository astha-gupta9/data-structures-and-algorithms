import java.util.Scanner;

public class RightAngledNumberPyramid2 {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = 1; i <= rows; i++) {     // Rows
            for (int j = 1; j <= i; j++) {     // Cols
                System.out.print(i + " ");      // Print
            }
            System.out.println();     // Next Row
        }
    }
}