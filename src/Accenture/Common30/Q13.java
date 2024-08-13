package Accenture.Common30;

public class Q13 {
    public static void main(String[]args){
       int[]arr = {23,45,82,27,66,12,78,13,71,86,98};
       int max = getMax(arr);
       System.out.println(max);
    }
    public static int getMax(int[]arr){
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        return max;
    }
}
