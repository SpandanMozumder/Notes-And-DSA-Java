
import java.util.Scanner;

public class JavaBasics {

    public static void method1() {
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.print("Hello World!\n");
        System.out.print("Hello World!\n");
        System.out.print("Hello World!\nHello World!\nHello World!");

        System.out.println();

    }

    public static void method2() {
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    public static void method3() {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        String name = "Tony Stark";
        System.out.println(name);

        a = b;
        System.out.println(a);
    }

    public static void method4() {
        byte b = 8;
        System.out.println(b);
        char ch = 'a';
        System.out.println(ch);
        boolean bool = true;
        System.out.println(bool);
        float f = 10.5f;
        System.out.println(f);
        int num = 10;
        System.out.println(num);
        long l = 100000000000000000L;
        System.out.println(l);
        short s = 100;
        System.out.println(s);
        double d = 10.5;
        System.out.println(d);
    }

    public static void sum() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }

    //comment
    //comment2

    /*
     * comment
     * comment2
     * comment3
     */
    public static void input() {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        String input2 = sc.nextLine();
        System.out.println(input2);
    }

    public static void suminput() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);
    }

    public static void product() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        System.out.println(c);
    }

    public static void circlearea() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area1 = 3.14 * r * r;
        float area2 = 3.14f * r * r;
        System.out.println(area1);
        System.out.println(area2);
    }

    public static void typeconversion() {
        int a = 10;
        double b = a;
        System.out.println(b);

        int x = 25;
        long z = x;
        System.out.println(z);

        double c = 10.5;
        int d = (int) c;
        System.out.println(d);
    }

    public static void typepromotion() {
        char a = 'a';
        char b = 'b';
        System.out.println((int) (b));
        System.out.println((int) (a));

        System.out.println(b - a);

        int m = 10;
        float n = 20.25f;
        long o = 25;
        double p = 30;
        System.out.println(m + n + o + p);
    }

    public static void average() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println(avg);
    }

    public static void areasquare() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int area = a * a;
        System.out.println(area);
    }

    public static void bill() {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;

        System.out.println("Bill is : " + total);
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax : " + newTotal);
    }

    public static void unaryoperators() {
        int a = 10;
        int b = 10;
        System.out.println(a++);
        System.out.println(++b);
    }

    public static void relationaloperators() {
        int a = 10;
        int b = 20;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }

    public static void logicaloperators() {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
    }

    public static void main(Strings[] args) {
        method1();
        method2();
        method3();
        method4();
        sum();
        input();
        suminput();
        product();
        circlearea();
        typeconversion();
        typepromotion();
        average();
        areasquare();
        bill();
        unaryoperators();
        relationaloperators();
        logicaloperators();
    }
}
