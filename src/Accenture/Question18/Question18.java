package Accenture.Question18;

public class Question18 {
    public static void main(String[] args) {
//        String str = "1C0C1C1A0B1";
//        String str = "1C1A1BOCA0";
        String str = "0C1A1B1C1C1B0A0";
        int ans = getBinaryOperation(str);
        System.out.println(ans);
    }

    public static int getBinaryOperation(String str) {
        int prev = 0;
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '1') {
                prev = 1;
            } else if (c == '0') {
                prev = 0;
            }

            if (c == 'C') {
                ans ^= prev;
            } else if (c == 'A') {
                ans &= prev;
            } else {
                ans |= prev;
            }

        }
        return ans;
    }
}
