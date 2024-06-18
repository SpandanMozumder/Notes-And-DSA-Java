
import java.util.Scanner;

public class Matrices {

    public static void search(int arr[][], int key) {
        int rows = arr.length;
        int columns = arr[0].length;
        int i = 0;
        int j = columns - 1;
        while (i < rows && j >= 0) {
            if (arr[i][j] == key) {
                System.out.println("Element found at position (" + i + ", " + j + ")");
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(Strings args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        search(matrix, key);
    }
}
