package Accenture.Common30;

public class Q3 {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        boolean isTrue = isAnargam(str1, str2);
        System.out.println(isTrue);
    }

    public static boolean isAnargam(String string1, String string2) {
        string1=string1.toUpperCase();
        string2=string2.toUpperCase();
        if (string1.length() != string2.length()) return false;
        for (int i = 0; i < string1.length(); i++) {
            char c = string1.charAt(i);
            if (string2.indexOf(c) == -1) return false;
        }
        return true;
    }
}
