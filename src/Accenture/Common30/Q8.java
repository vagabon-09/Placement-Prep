package Accenture.Common30;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int a = 16;
        int b = 20;
        int c = 2;
        int ans = operationchoices(a, b, c);
        System.out.println(ans);
    }

    public static int operationchoices(int a, int b, int c) {
        return switch (c) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> -1;
        };
    }
}
