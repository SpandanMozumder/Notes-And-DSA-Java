
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class InbuiltSorting {

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        Arrays.sort(arr, 0, 5);
        System.out.println("Sorted array from index 0 to 5: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }
}
