package Accenture.Common30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 7, 9};
        answer(arr);
    }

    private static void answer(int[] arr) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println(even+"\n"+odd);
    }
}
