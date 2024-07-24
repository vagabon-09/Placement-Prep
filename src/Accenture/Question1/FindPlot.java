package Accenture.Question1;

public class FindPlot {
    // in the given question answer is written wrong int the image(Question) it will be 4 not 3
    public static void main(String[] args) {
        int[] plots = {64, 16, 38, 81, 50, 100};
        int ans = perfectPlots(plots);
        System.out.println(ans);
    }

    public static int perfectPlots(int[] plots) {
        int count = 0;
        for (int plot : plots) {
            double n = Math.sqrt(plot);
            if (n % 1 == 0) {
                count++;
            }
        }
        return count;
    }
}
