
import java.util.Scanner;

public class SumDigits {

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void main(Strings[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("The sum of the digits of " + number + " is " + sumDigits(number) + ".");
        scanner.close();
        
    }
}
