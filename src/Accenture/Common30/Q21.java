package Accenture.Common30;

public class Q21 {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 8, 0};
//        int[] arr = {4};
        int secLargest = getSecLarge(arr);
        System.out.println(secLargest);
    }

    public static int getSecLarge(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;
        int largest = arr[0];
        int sec = arr[0];
        for (int j : arr) {
            if (j > largest) {
                sec = largest;
                largest = j;
            } else if (largest != j && j > sec) {
                sec = j;
            }
        }
        return sec;
    }
}
