
import java.util.Scanner;

public class LinearSearch {

    public static void search(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Key found at index: " + i);
                return;
            }
        }
        System.out.println("Key not found");
    }

    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();
        search(numbers, key);
    }
}
