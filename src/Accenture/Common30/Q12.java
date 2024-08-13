package Accenture.Common30;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Q12 {
    public static void main(String[] args) {
        System.out.println("Enter password ");
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        boolean isTrue = isPasswordValid(password);
        System.out.println(isTrue);
    }

    public static boolean isPasswordValid(String password) {
        boolean size = password.length() >= 4;
        boolean isCapital = Pattern.compile("[A-Z]").matcher(password).find();
        boolean isSmall = Pattern.compile("[a-z]").matcher(password).find();
        boolean isNumber = Pattern.compile("[0-9]").matcher(password).find();
        boolean isSpecial = Pattern.compile("[^A-Za-z0-9]").matcher(password).find();
        return isCapital && isSmall && isNumber && !isSpecial && size;
    }
}
