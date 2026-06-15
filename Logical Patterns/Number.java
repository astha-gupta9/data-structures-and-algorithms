import java.util.Scanner;

public class Number {
    public static void main (String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        // Pattern
        for (int i = 0; i <= 2 * num - 2; i++) {     // Rows
            for (int j = 0; j <= 2 * num - 2; j++) {     // Cols
                System.out.print((num - Math.min(Math.min(i, j), Math.min(2 * num - 2 - i, 2 * num - 2 - j))) + " ");
            }

            System.out.println();     // Next Row
        }
    }
}