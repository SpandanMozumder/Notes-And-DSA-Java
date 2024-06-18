
import java.util.Scanner;

public class Loops {

    public static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void print10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void printn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    public static void forloop() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    public static void squarepattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reversenumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int lastdigit = temp % 10;
            rev = rev * 10 + lastdigit;
            temp /= 10;
        }
        System.out.println("Reverse of " + n + " is: " + rev);
    }

    public static void dowhileloop() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    public static void breakstatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void continuestatement() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void multiplebreak() {
        Scanner sc = new Scanner(System.in);
        do {
            int x = 0;
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
            x++;
            if (x == 10) {
                break;
            }
        } while (true);
    }

    public static void multiplecontinue() {
        Scanner sc = new Scanner(System.in);
        do {
            int x = 0;
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
            x++;
            if (x == 10) {
                break;
            }
        } while (true);
    }

    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static void evenoddsum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }

    public static void multiplicationtable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(Strings[] args) {
        whileLoop();
        print10();
        printn();
        sum();
        forloop();
        squarepattern();
        reversenumber();
        dowhileloop();
        breakstatement();
        continuestatement();
        multiplebreak();
        multiplecontinue();
        prime();
    }
}
