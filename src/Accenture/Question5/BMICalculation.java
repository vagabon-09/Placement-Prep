package Accenture.Question5;

public class BMICalculation {
    public static void main(String[] args) {
        int weight = 62;
        float height = 1.52f;
        int ans = getBmi(weight, height);
        if (ans < 18) System.out.println("0");
        if (ans >= 18 && ans < 25) System.out.println("1");
        if (ans >= 25 && ans < 30) System.out.println("2");
        if (ans >= 30 && ans < 40) System.out.println("3");
        if (ans >= 40) System.out.println("4");
    }

    public static int getBmi(int weight, float height) {
        return (int) (weight / (height * height));
    }
}
