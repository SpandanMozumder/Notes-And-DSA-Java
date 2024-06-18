
public class BitManipulation {

    public static void main(String[] args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~5);
        System.out.println(5 << 1);  //a<<b = a*2^b
        System.out.println(5 >> 1); //a>>b = a/2^b
        System.out.println(5 >>> 1);

        oddEven(5);
        getithbit(5, 2);
        setithbit(5, 1);
        clearithbit(5, 2);
        upateithbit1(5, 1, 0);
        updateithbit2(5, 1, 1);
        clearlastibits(5, 2);
        clearrangeofbits(31, 1, 3);
        powerof2(16);
        countsetbits(15);
        fastExponentiation(2, 5);
    }

    public static void oddEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void getithbit(int n, int i) {
        int mask = 1 << i;
        if ((n & mask) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }

    public static void setithbit(int n, int i) {
        int mask = 1 << i;
        int ans = n | mask;
        System.out.println(ans);
    }

    public static void clearithbit(int n, int i) {
        int mask = ~(1 << i);
        int ans = n & mask;
        System.out.println(ans);
    }

    public static void upateithbit1(int n, int i, int newBit) {
        if (newBit == 0) {
            clearithbit(n, i);
        } else {
            setithbit(n, i);
        }
    }

    public static void updateithbit2(int n, int i, int v) {
        int mask = ~(1 << i);
        int cleared_n = n & mask;
        int mask2 = v << i;
        int ans = cleared_n | mask2;
        System.out.println(ans);
    }

    public static void clearlastibits(int n, int i) {
        int mask = (-1 << i);
        int ans = n & mask;
        System.out.println(ans);
    }

    public static void clearrangeofbits(int n, int i, int j) {
        int a = -1 << (j + 1);
        int b = (1 << i) - 1;
        int mask = a | b;
        int ans = n & mask;
        System.out.println(ans);
    }

    public static void powerof2(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }

    public static void countsetbits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    public static void fastExponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            int last_bit = (n & 1);
            if (last_bit == 1) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println(ans);
    }

    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }

}
