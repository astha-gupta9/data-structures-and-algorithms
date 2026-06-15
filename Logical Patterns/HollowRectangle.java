import java.util.Scanner;

public class HollowRectangle {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = 1; i <= rows; i++) {     // Row
            for (int j = 1; j <= rows; j++) {     // Col
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();     // Next Row
        }
    }
}