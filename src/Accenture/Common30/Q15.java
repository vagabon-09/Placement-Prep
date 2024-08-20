package Accenture.Common30;

public class Q15 {
    public static void main(String[] args) {
        String num = "1210";
        int biog = isItBiographical(num);
        System.out.println(biog);
    }

    public static int isItBiographical(String num) {
        int n = num.length();
        int[] track = new int[n];
        for (int i = 0; i < n; i++) {
            int c = num.charAt(i) - '0';
            if (c < n) track[c]++;
            else return 0;
        }
        for (int i = 0; i < n; i++) {
            if (track[i] != (num.charAt(i) - '0')) return 0;
        }
        int nonInteger = 0;
        for (int i = 0; i < n; i++) {
            if (track[i] != 0) nonInteger++;
        }
        return nonInteger;
    }

}
