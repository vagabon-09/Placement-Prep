package Accenture.Common30;

public class Q9 {
    public static void main(String[] args) {
        int start = 100;
        int end = 160;
        int ans = findAns(start, end);
        System.out.println(ans);
    }

    public static int findAns(int s, int e) {
        int sum = 0;
        for (int i = s; i <= e; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
