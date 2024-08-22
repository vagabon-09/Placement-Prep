package Accenture.Common30;

public class Q24 {
    public static void main(String[] args) {
        int num = 36;
        int divSum = getDivSum(num);
        System.out.println(divSum);
    }

    public static int getDivSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += n%i == 0 ? i : 0;
        }
        return sum;
    }
}
