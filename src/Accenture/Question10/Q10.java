package Accenture.Question10;
import java.util.HashMap;
import java.util.Map;

public class Q10 {
    public static void main(String[] args) {
        int size = 10;
        int[] voter = {1, 1, 2, 3, 4, 1, 2, 2, 3, 1};
        int[] age = {24, 13, 35, 15, 50, 16, 20, 18, 25, 64};
        int winner = getWinner(size, voter, age);
        System.out.println(winner);
    }

    public static int getWinner(int N, int[] voter, int[] age) {
        HashMap<Integer, Integer> winner = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (age[i] >= 18) {
                int key = voter[i];
                int value = winner.get(key) == null ? 1 : winner.get(key) + 1;
                winner.put(key, value);
            }
        }
        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : winner.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();
            if (maxValue < value) {
                maxValue = value;
                maxKey = key;
            }
        }
        return maxKey;
    }
}
