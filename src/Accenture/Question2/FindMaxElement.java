package Accenture.Question2;

import java.util.Arrays;

public class FindMaxElement {
    // Question is available in the image , which is present in the respective folder
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {23, 45, 82, 71};
        printIndexAndMaxNum(arr2);
    }

    public static void printIndexAndMaxNum(int[] arr) {
        int position = 0;
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
                position = i;
            }
        }
        System.out.println(maxNum + "\n" + position);
    }
}
