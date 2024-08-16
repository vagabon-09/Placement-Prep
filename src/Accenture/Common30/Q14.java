package Accenture.Common30;


import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        String str = "babadababab";
        char x = 't';
        String returnStr = chatFrequentcharacter(str, x);
        System.out.println(returnStr);
    }

    public static String chatFrequentcharacter(String str, char x) {
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int n = c - 'a';
            arr[n]++;
        }
        int position1 = getMaxPosition(arr, 0, -1);
        int position2 = getMaxPosition(arr, -1, position1);
        char ch = (char) ('a' + Math.min(position1, position2));
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char nc = str.charAt(i);
            stb.append(nc != ch ? nc : x);
        }
        return stb.toString();
    }

    public static int getMaxPosition(int[] arr, int position, int prev) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (i != prev && max < arr[i]) {
                max = arr[i];
                position = i;
            }
        }

        return position;
    }
}
