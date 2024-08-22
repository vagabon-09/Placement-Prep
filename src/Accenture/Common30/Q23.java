package Accenture.Common30;


public class Q23 {
    public static void main(String[] args) {
        String str = "Code to Crack Puzzle";
        String reverse = getReverse(str);
        System.out.println(reverse);
    }

    public static String getReverse(String str) {
        String[] reverse = str.split(" ");
        StringBuilder stb = new StringBuilder();
        for (int i = reverse.length - 1; i >= 0; i--) {
            if (i != 0) stb.append(reverse[i]).append(" ");
            else stb.append(reverse[i]);

        }
        return stb.toString();
    }
}
