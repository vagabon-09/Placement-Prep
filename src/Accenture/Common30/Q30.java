package Accenture.Common30;

public class Q30 {
    public static void main(String[] args) {
        String str1 = "build";
        String str2 = "dubli";
        boolean isAna = isAnargrams(str1, str2);
        System.out.println(isAna);
    }

    public static boolean isAnargrams(String st1, String st2) {
        int[] ana = new int[26];
        for (int i = 0; i < st1.length(); i++) {
            int n = st1.charAt(i) - 'a';
            ana[n]++;
        }
        for (int i = 0; i < st2.length(); i++) {
            int n = st2.charAt(i) - 'a';
            ana[n]--;
        }
        for (int i : ana) {
            if (i != 0) return false;
        }
        return true;
    }
}
