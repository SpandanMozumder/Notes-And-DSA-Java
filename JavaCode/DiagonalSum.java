
import java.util.Scanner;

public class DiagonalSum {

    public static void diagonalSum(int matrix[][]) {
        int sumd1 = 0;
        int sumd2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumd1 += matrix[i][i];

            if (i != matrix.length - i - 1) {
                sumd2 += matrix[i][matrix.length - i - 1];
            }
        }
        System.out.println("Left Diagonal: " + sumd1);
        System.out.println("Right Diagonal: " + sumd2);
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        diagonalSum(matrix);
    }
}
