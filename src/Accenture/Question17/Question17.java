package Accenture.Question17;

public class Question17 {
    public static void main(String[] args) {
        int r = 7;
        int n = 8;
        int unit = 2;
        int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};
        int ans = getRatFood(arr, n, r, unit);
        System.out.println(ans);
    }

    public static int getRatFood(int[] arr, int n, int r, int unit) {
        if (n == 0) return -1;
        int totalFood = r * 2;
        int total = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (totalFood <= total) {
                return count;
            }
            count++;
            total += arr[i];
        }
        return 0;
    }
}
