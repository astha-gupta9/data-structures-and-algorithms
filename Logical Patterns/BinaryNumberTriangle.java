import java.util.Scanner;

public class BinaryNumberTriangle {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = 0; i < rows; i++) {     // Rows
            for (int j = 0; j <= i; j++) {     // Cols
                
                // Print
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();     // Next Row
        }
    }
}