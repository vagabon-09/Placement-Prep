package Accenture.Question8;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        /*
         * 0 -> Capital Letter
         * 1 -> small letter
         * 2 -> Numeric value
         * 3 -> Special Character
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password ");
        String pass = sc.nextLine();
        int[] cta = new int[4];
        int j = 0;

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);

            if ((c >= 'A' && c <= 'Z')) {
                cta[0] += 1;
            } else if (c >= 'a' && c <= 'z') {
                cta[1] += 1;
            } else if (c >= '0' && c <= '9') {
                cta[2] += 1;
            } else {
                cta[3] += 1;
            }
        }
        if (cta[0] > 0 && cta[1] > 0 && cta[2] > 0 && cta[3] >= 2) {
            System.out.println("0");
            return;
        }
        if (cta[0] == 0) j++;
        if (cta[1] == 0) j++;
        if (cta[2] == 0) j++;
        if (cta[3] < 2) j++;
        if (pass.length() < 6 || pass.length() > 22) j++;
        System.out.println(j);
    }
}
