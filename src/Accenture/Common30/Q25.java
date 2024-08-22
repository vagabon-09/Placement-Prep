package Accenture.Common30;

import java.math.BigInteger;
import java.util.*;

public class Q25 {
    public static void main(String[] args) {
        int[] arr = {34, 79, 58, 64};
        BigInteger a;
        a = getBigValue(arr);
        System.out.println(a);
    }

    public static BigInteger getBigValue(int[] val) {
        BigInteger sum = BigInteger.valueOf(0);
        int[] arr = new int[10];
        for (int j : val) {
            int num = j;
            while (num != 0) {
                int n = num % 10;
                arr[n] = arr[n] + 1;
                num /= 10;
            }
        }
        System.out.println(Arrays.toString(arr));
        BigInteger bg = BigInteger.valueOf(10);
        for (int i = 9; i >= 0; i--) {
            if (arr[i] != 0) {
                System.out.println(i);
                while (arr[i] != 0) {
                    sum = sum.multiply(bg).add(BigInteger.valueOf(i));
                    arr[i]--;
                }
            }

        }
        return sum;
    }
}
