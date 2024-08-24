package Accenture.Question20;

public class Question20 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 14, 56, 77, 13};
        int num = 13;
        int diff = 2;
        int ans = getValidAbsDef(arr, num, diff);
        System.out.println(ans);
    }

    public static int getValidAbsDef(int[] arr, int num, int diff) {
        int count = 0;
        for (int n : arr) {
            if (Math.abs(n - num) <= diff) count++;
        }
        return count;
    }
}
