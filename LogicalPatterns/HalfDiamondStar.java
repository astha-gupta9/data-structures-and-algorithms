import java.util.Scanner;

public class HalfDiamondStar {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        // Pattern

        // Left Half Pyramid
        for (int i = 0; i < rows; i++) {     // Rows
            for (int j = 0; j <= i; j++) {     // Cols
                System.out.print("* ");
            }
            System.out.println();     // Next Row
        }

        // Inverted Left Half Pyramid
        for (int i = rows - 1; i > 0; i--) {     // Rows
            for (int j = 0; j < i; j++) {     // Cols
                System.out.print("* ");
            }
            System.out.println();     // Next Row
        }
    }
}