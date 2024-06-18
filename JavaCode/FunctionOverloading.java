
public class FunctionOverloading {

    public static void multiply() {
        int a = 10, b = 20;
        int c = a * b;
        System.out.println("Product: " + c);
    }

    public static void multiply(int a, int b) {
        int c = a * b;
        System.out.println("Product: " + c);
    }

    public static void multiply(int a, int b, int d) {
        int c = a * b * d;
        System.out.println("Product: " + c);
    }

    public static void main(Strings[] args) {
        multiply();
        multiply(5, 10);
        multiply(7, 3);
        multiply(2, 3, 4);
    }
}
