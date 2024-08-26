package Accenture.Question25;

public class Question25 {
    public static void main(String[] args) {
        String[] arr = {"file_1", "file_2", "file_4", "file_3","file_24"};
        int version = getHighesV(arr);
        System.out.println(version);
    }

    public static int getHighesV(String[] arr) {
        int num = Integer.MIN_VALUE;
        for (String s : arr) {
            int v = getVersion(s);
            if (v > num) {
                num = v;
            }
        }
        return num;
    }

    public static int getVersion(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '0' && c < '9') {
                s.append(c);
            }
        }
        return Integer.parseInt(s.toString());
    }

}
