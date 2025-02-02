
import java.util.Scanner;

public class PalindromeString {

    public static void checkpalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not a Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        checkpalindrome(str);
    }
}
