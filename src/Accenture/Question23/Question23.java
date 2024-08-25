package Accenture.Question23;

import java.util.*;

public class Question23 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 9, 7, 1};
        int output = findOutPut(arr, 9);
        System.out.println(output);
    }

    public static int findOutPut(int[] arr, int sum) {
        if (arr.length < 2) return -1;
        Arrays.sort(arr);
        if (arr[0] + arr[1] < sum) return arr[0] * arr[1];
        return 0;
    }

}
