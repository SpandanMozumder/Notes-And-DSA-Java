
public class FunctionOverloadingDataTypes {

    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    public static double multiply(double a, double b) {
        double c = a * b;
        return c;
    }

    public static void main(Strings[] args) {
        int prod = multiply(5, 10);
        System.out.println("Product: " + prod);
        double prod1 = multiply(7.5, 3.5);
        System.out.println("Product: " + prod1);
    }
}
