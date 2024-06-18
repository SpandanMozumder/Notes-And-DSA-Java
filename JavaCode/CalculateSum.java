import java.util.Scanner;
public class CalculateSum {
    public static void calculateSum1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    }

    public static void calculateSum2(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static void main(Strings[] args) {
        calculateSum1();
        calculateSum2(10, 20);
    }
}
