
import java.util.Scanner;

public class MatrixSearch {

    public static void search1(int matrix[][], int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int x = 0;
        int y = m - 1;
        while (x < n && y >= 0) {
            if (matrix[x][y] == target) {
                System.out.println("Element found at: " + x + ", " + y);
                return;
            }
            if (matrix[x][y] > target) {
                y--;
            } else {
                x++;
            }
        }
        System.out.println("Element not found");
    }

    public static void search2(int matrix[][], int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int x = n - 1;
        int y = 0;

        while (y < m && x >= 0) {
            if (matrix[x][y] == target) {
                System.out.println("Element found at: " + x + ", " + y);
                return;
            }
            if (matrix[x][y] > target) {
                x--;
            } else {
                y++;
            }
        }
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();
        search1(matrix, target);
    }
}
