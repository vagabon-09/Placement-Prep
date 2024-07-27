package Accenture.Common30;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int sum = 9;
        int[] arr = {5, 4, 2, 3, 9, 1, 7};
        int ans = productsmallpair(sum, arr);
        if (ans == 2) {
            System.out.println("Answer Accepted");
        }
    }

    public static int productsmallpair(int sum, int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;
        Arrays.sort(arr);
        int s1 = arr[0];
        int s2 = arr[1];
        if (s1 + s2 > sum) return 0;
        return s1 * s2;
    }
}
