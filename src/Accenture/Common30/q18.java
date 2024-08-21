package Accenture.Common30;

import java.util.*;

public class q18 {
    public static void main(String[] args) {
        int[] arr = {74, 85, 102, 99, 101, 56, 84};
        int k = 2;
        int kGreatest = getKthGreatest(arr, k);
        System.out.println(kGreatest);
    }

    public static int getKthGreatest(int[] arr, int k) {
        Arrays.sort(arr);
        int n = (arr.length - 1) - k % arr.length;
        return arr[n];
    }
}
