package Accenture.Question24;

public class Question24 {
    public static void main(String[] args) {
        int num = 718;
        int n = 12;
        String output = getOutput(num, n);
        System.out.println(output);
    }

    public static String getOutput(int num, int n) {
        int cal = 'A' - 10;
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            int x = num % n;
            if (x >= 10) {
                char c = (char) (cal + x);
                str.insert(0,c);
            } else str.insert(0,x);
            num = num/n;
        }
        return str.toString();
    }
}
