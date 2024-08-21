package Accenture.Common30;

public class Q22 {
    public static void main(String[]args){
        int day = 3;
        int tc = getChiraty(day);
        System.out.println(tc);
    }

    public static int getChiraty(int day){
        int sum =0;
        for(int i =1; i<=day; i++){
            sum += (i*i);
        }
        return sum;
    }
}
