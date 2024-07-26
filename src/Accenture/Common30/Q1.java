package Accenture.Common30;

public class Q1 {
    public static void main(String[] args) {
        int m = 6;
        int n = 30;
        int ans = differenceofSum(m, n);
        System.out.println(ans);
    }

    public static int differenceofSum(int m, int n) {
        int dSum = 0;
        int ndSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                dSum += i;
            } else {
                ndSum += i;
            }
        }
        return Math.abs(dSum - ndSum);
    }
}
