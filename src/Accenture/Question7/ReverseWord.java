package Accenture.Question7;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hello World";
        String reverse = getReverse(str);
        System.out.println(reverse);
    }

    public static String getReverse(String str) {
        String[] s = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
