public class BinomialCoefficient {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int k){
        int num = factorial(n);
        int den = factorial(k) * factorial(n - k);
        int binom = num / den;
        return binom;
    }

    public static void main(Strings[] args) {
        int n = 5;
        int k = 2;
        int binom = binomialCoefficient(n, k);
        System.out.println("Binomial Coefficient: " + binom);
    }
    
}
