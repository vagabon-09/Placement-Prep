package Accenture.Question19;

import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        int validation = isValid(password);
        System.out.println(validation);
    }

    public static int isValid(String password) {
        int n = password.length();
        if (n < 4) return 0;
//        System.out.println("numaric = " + numaric(password) + "capital = " + capital(password) + " spacesSlash = " + spaceSlash(password) + "starting = " + startingN(password));
        if (!numaric(password)) return 0;
        if (!capital(password)) return 0;
        if (spaceSlash(password)) return 0;
        if (!startingN(password)) return 0;
        return 1;

    }

    public static boolean startingN(String password) {
        return password.charAt(0) < '0' || password.charAt(0) > '9';
    }

    public static boolean spaceSlash(String password) {
        for (char c : password.toCharArray()) {
            if (c == ' ' || c == '/' || c == '\\') return true;
        }
        return false;
    }

    public static boolean capital(String password) {
        for (char c : password.toCharArray()) {
            if (c > 'A' && c < 'Z') return true;
        }
        return false;
    }

    public static boolean numaric(String password) {
        for (char c : password.toCharArray()) {
            if (c > '0' && c < '9') return true;
        }
        return false;
    }
}
