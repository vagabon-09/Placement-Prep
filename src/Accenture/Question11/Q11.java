package Accenture.Question11;

public class Q11 {
    public static void main(String[] args) {
        int N = 17;
        int M = 2;
        int ans = getResult(N, M);
        System.out.println(ans);
    }

    public static int getResult(int n, int m) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (m * i <= n) {
                ans = i;
            } else {
                int max = n-(m*ans);
                ans += max;
                break;
            }
        }
        return ans;
    }
}
