package Accenture.Common30;

public class Q6 {
    public static void main(String[] args) {
        int num1 = 57558;
        int num2 = 23579;
        int totalCarry = getTotalCarry(num1, num2);
        System.out.println(totalCarry);
    }

    public static int getTotalCarry(int n1, int n2) {
        int carry = 0;
        int count = 0;

        while (n1 > 0 || n2 > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            int sum = digit1 + digit2 + carry;
            if (sum > 9) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }

            n1 /= 10;
            n2 /= 10;
        }

        return count;
    }
}
