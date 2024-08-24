package Accenture.Question21;

public class Question21 {
    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        int output = getDiv(n, m);
        System.out.println(output);
    }

    public static int getDiv(int n, int m) {
        int div = 0;
        int nonDiv = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) div += i;
            else nonDiv += i;
        }
        return Math.abs(nonDiv - div);
    }
}
