package Accenture.Common30;

import java.util.Arrays;

public class Q17 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 6};
        int[] num2 = {4, 5, 7};
        int[] finalArray = getMarge(num1, 4, num2, 3);
        System.out.println(Arrays.toString(finalArray));
    }

    public static int[] getMarge(int[] num1, int n, int[] num2, int m) {
        int[] marge = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (num1[i] < num2[j]) {
                marge[k] = num1[i];
                i++;
            } else {
                marge[k] = num2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            marge[k] = num1[i];
            i++;
            k++;
        }

        while (j < m) {
            marge[k] = num2[j];
            j++;
            k++;
        }

        return marge;
    }
}
