package Accenture.Question16;

import java.util.*;

public class Question16 {
    public static void main(String[] args) {
//        int[] arr = {8, 7, 1, 6, 5, 9};
        int[] arr = {4, 2, 8, 6, 15, 5, 9, 20};
        getAlterArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void getAlterArr(int[] arr) {
        Arrays.sort(arr);
        reverse(arr, arr.length / 2);
    }

    public static void reverse(int[] arr, int n) {
        int m = arr.length - 1;
        while (n < m) {
            int temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
            n++;
            m--;
        }
    }
}
