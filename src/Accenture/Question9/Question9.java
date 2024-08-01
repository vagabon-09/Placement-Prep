package Accenture.Question9;

public class Question9 {
    public static void main(String[] args) {
//        String str = "1C0C1C1A0B1";
        String str = "0C1A1B1C1C1B0A0";
        int ans = getOperation(str);
        System.out.println(ans);
    }

    public static int getOperation(String str) {
        int n1 = str.charAt(0);
        int n2 = str.charAt(2);
        int ans = condition(n1 - 48, str.charAt(1), n2 - 48);
        int num = 0;
        char last = ' ';
        for (int i = 3; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                last = c;
                ans = condition(ans, c, num);
            } else {
                num = c - '0';
            }

        }
        num = str.charAt(str.length() - 1) - '0';
        ans = condition(ans, last, num);
        return ans;
    }

    public static int condition(int n1, char c, int n2) {
        if (c == 'C') {
            return n1 ^ n2;
        } else if (c == 'B') {
            return n1 | n2;
        } else {
            return n1 & n2;
        }
    }
}
