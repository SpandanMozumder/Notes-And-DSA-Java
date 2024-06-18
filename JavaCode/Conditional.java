
import java.util.Scanner;

public class Conditional {

    public static void age() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("adult: drive, vote");
        }
        if (age > 13 && age < 18) {
            System.out.println("teen: school, college");
        } else {
            System.out.println("not adult");
        }
    }

    public static void largest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is largest");
        } else if (b > a && b > c) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }
    }

    public static void evenodd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void incometax() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = sc.nextDouble();
        double tax = 0.0;

        if (income < 250000) {
            tax = income * 0.0;
        } else if (income >= 250000 && income < 500000) {
            tax = income * 0.05;
        } else if (income >= 500000 && income < 1000000) {
            tax = income * 0.1;
        } else {
            tax = income * 0.2;
        }

        System.out.println("Tax: " + tax);
        System.out.println("Payable: " + (income + tax));
    }

    public static void ternarylargest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Largest: " + largest);
    }

    public static void passfail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
    
        String result = marks > 40 ? "pass" : "fail";
        System.out.println("Result: " + result);
    }

    public static void switchcase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public static void fallthrough() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Invalid number");
        }
    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter an operator: ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
    }

    public static void positivenegative() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void weekdays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    public static void leapyear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static void main(Strings[] args) {
        age();
        largest();
        evenodd();
        incometax();
        ternarylargest();
        passfail();
        switchcase();
        fallthrough();
        calculator();
        positivenegative();
        weekdays();
        leapyear();
    }
}
