package Accenture.Question22;

import java.util.*;

public class Question22 {
    public static void main(String[] args) {
//        int[] arr = {3, 2, 1, 7, 5, 4};
        int[] arr = {1, 8, 0, 2, 3, 5, 6};
        int ans = getAns(arr);
        System.out.println(ans);
    }

    public static int getAns(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> even = getEven(arr);
        ArrayList<Integer> odd = getOdd(arr);

        int e = 0;
        int o = 0;
        int i = 1;
        for (int num : even) {
            if (i == even.size() - 1) {
                e = num;
            }
            i++;
        }
        i = 0;
        for (int num : odd) {
            if (i == 1) {
                o = num;
            }
            i++;
        }
        return e + o;
    }

    public static ArrayList<Integer> getEven(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            }
        }
        return even;
    }

    public static ArrayList<Integer> getOdd(int[] arr) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(i % 2 == 0)) odd.add(arr[i]);
        }
        return odd;
    }
}
