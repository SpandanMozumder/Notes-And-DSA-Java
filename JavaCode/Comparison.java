
public class Comparison {

    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        System.out.println(s1 == s2);

        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));
    }
}
