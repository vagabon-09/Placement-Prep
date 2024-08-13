package Accenture.Common30;

public class Q11 {
    public static void main(String[] args) {
//        String str = "ICOCICIAOBI";
        String str = "ICICOCICOAIBO";
        int ans = getAns(str);
        System.out.println(ans);
    }

    public static int getAns(String str) {
        int ans = str.charAt(0) == 'I' ? 1 : 0;
        int prev = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            char s = str.charAt(i);
            int c = str.charAt(i + 1) == 'I' ? 1 : 0;
            if (s == 'C') ans = ans ^ c;
            else if (s == 'A') ans = ans & c;
            else if (s == 'B') ans = ans | c;
        }
        return ans;
    }
}
