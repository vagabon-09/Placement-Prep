package Accenture.Common30;

public class Q5 {
    public static void main(String[] args) {
        int n = 21;
        int num = 5678;
        String ans = decodeNBase(n, num);
        System.out.println(ans);
    }

    public static String decodeNBase(int n, int num) {
        StringBuilder str = new StringBuilder();

        while (num != 0) {
            int d = num % n;
            if (d > 9) {
                int val = d - 10;
                char c = (char) ('A' + val);
                str.append(c);
            } else {
                str.append(d);
            }
            num = num / n;
        }
        return str.reverse().toString();
    }
}
