package Accenture.Common30;

public class Q29 {
    public static void main(String[] args) {
        String str = "level";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String str) {
        int n = str.length() - 1;
        int i = 0;
        while (i < n) {
            char p = str.charAt(i);
            char p2 = str.charAt(n);
            if (p != p2) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}
