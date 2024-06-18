
import java.util.Scanner;

public class Strings {

    public static void main(String args[]) {
        String str = "abcd";
        String str2 = new String("abcdefgh");

        System.out.println(str);
        System.out.println(str2);

        Scanner sc = new Scanner(System.in);
        String str3 = sc.next();
        System.out.println(str3);

        String str4 = sc.nextLine();
        System.out.println(str4);

        System.out.println(str4.length());

        System.out.println(str3 + " " + str4);

        System.out.println(str3.concat(str4));

        System.out.println(str3.equals(str4));

        System.out.println(str3.charAt(0));

        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str3.charAt(i) + " ");
        }
    }
}
