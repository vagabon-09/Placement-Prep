package Accenture.Question15;

public class Question15 {
    public static void main(String[]args){
        int[] arr = {21,24,67,13,24,27};
        int n = 6;
        int ans = getEvenSum(arr,n);
        System.out.println(ans);
    }
    public static int getEvenSum(int[]arr,int n){
        int sum = 0;
        reverse(arr,0,n-1);
        for(int i=0; i<n; i++){
            if(i%2==0) sum += arr[i];
        }
        return sum;
    }

    public static void reverse(int[]arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
