
public class Uppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(sb.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(toUpperCase(str));
    }

}
