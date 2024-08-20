package Accenture.Common30;

import java.util.HashMap;
import java.util.concurrent.atomic.*;

public class Q15 {
    public static void main(String[] args) {
        String num = "1210";
        int biog = isItBiographical(num);
        System.out.println(biog);
    }

    public static int isItBiographical(String num) {
        HashMap<Integer, Integer> uniq = new HashMap<>();
        int rAn = 0;
        for (int i = 0; i < num.length(); i++) {
            int count = 0;
            char c = num.charAt(i);
            if (c != '0') rAn++;
            for (int j = 0; j < num.length(); j++) {
                if (i == (num.charAt(j) - '0')) count++;
            }
            uniq.put(i, count);
        }
        StringBuilder stb = new StringBuilder();
        for (Integer value : uniq.values()) {
            stb.append(value);
        }
        return stb.toString().equals(num) ? rAn : 0;
    }

}
