package Accenture.Common30;

public class Q7 {
    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p';
        String replace = getReplace(str, ch1, ch2);
        System.out.println(replace);
    }

    public static String getReplace(String str, char ch1, char ch2) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ch1) {
                stb.append(ch2);
            } else if (c == ch2) {
                stb.append(ch1);
            } else {
                stb.append(c);
            }
        }
        return stb.toString();
    }
}
