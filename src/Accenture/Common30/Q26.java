package Accenture.Common30;

public class Q26 {
    public static void main(String[] args) {
        String str = "1234";
        int modulo = getModulo(str);
        System.out.println(modulo);
    }

    public static int getModulo(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i) - '0';
            num = num * 10 + c;
        }
        return num % 11;
    }
}
