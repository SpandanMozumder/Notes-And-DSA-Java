public class Factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(Strings[] args) {
        int f = factorial(5);
        System.out.println("Factorial: " + f);
    }
}
