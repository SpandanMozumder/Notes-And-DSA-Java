public class CallValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method: a = " + a + " b = " + b);
    }

    public static void main(Strings[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before calling swap method: a = " + a + " b = " + b);
        swap(a, b);
        System.out.println("After calling swap method: a = " + a + " b = " + b);
    }
}
