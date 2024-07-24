package Accenture.Question4;

public class PrintPattern {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

}
