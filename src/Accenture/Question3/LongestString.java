package Accenture.Question3;

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {
        // This question is came in 2024 - may
        String word1 = "You Hello Obtain";
        String word2 = "yes no number";
        String largestString = getLargestString(word1); // brute force approach
        String largestStringOptimise = getLargestStringOptimise(word2);
        System.out.println(largestStringOptimise);
    }

    public static String getLargestStringOptimise(String word){
        String maxString ="";
        if(word==null || word.isEmpty()){
            return "";
        }
        String[]words = word.split(" ");
        for(String w:words){
            if(maxString.length()<w.length()){
                maxString = w;
            }
        }
        return maxString;
    }

    public static String getLargestString(String word) {
        int n = word.length();
        int maxSize = 0;
        StringBuilder ans = new StringBuilder();
        String finalAns = "";

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (c != ' ') {
                ans.append(c);
            }
            if (c == ' ' || i == n - 1) {
                if (ans.length() > maxSize) {
                    maxSize = ans.length();
                    finalAns = ans.toString();
                }
                ans.setLength(0);
            }
        }
        return finalAns;
    }

}
