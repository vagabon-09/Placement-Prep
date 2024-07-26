package Accenture.Common30;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 7, 5, 4};
        int ans = largeSmallSum(arr, arr.length);
        System.out.println(ans);
    }

    public static int largeSmallSum(int[] arr, int n) {
        if (n <= 3) return 0;
        int secondLarge = 0;
        int secondSmall = 0;
        Arrays.sort(arr);
        secondLarge = arr[n - 2];
        secondSmall = arr[1];
        return secondLarge + secondSmall;
    }
}
