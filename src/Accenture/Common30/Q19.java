package Accenture.Common30;

import java.util.Arrays;

public class Q19 {
    public static void main(String[] args) {
//        int[] arr = {2, 1, 4, 6, 3};
        int[] arr = {123, 21, 34, 45, 25, 675, 23, 44, 55, 900};
        int n = arr.length;
        int swapNo = getSwapNo(arr, n);
        System.out.println(swapNo);
        System.out.println(Arrays.toString(arr));
    }

    public static int getSwapNo(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i- 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
