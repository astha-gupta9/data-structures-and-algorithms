import java.util.Scanner;

public class RectangularStar {
    public static void main(String[] args) {

        // Input number of rows
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 0; i < rows; i++) {     // Rows
            for (int j = 0; j < rows; j++) {     // Cols
                System.out.print("* ");     // Print
            }
            System.out.println();     // Next Row
        }
    }
}
