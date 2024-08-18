package Accenture.Question14;

public class Question14 {
    public static void main(String[]args){
        String alpha = "DBC";
        int ans = getConPer(alpha);
        System.out.println(ans);
    }
    public static int getConPer(String alpha){
        int con = 0;
        for(int i=0; i<alpha.length(); i++){
            char c = alpha.charAt(i);
            if(c!='A' && c!='E' && c!='I' && c!='O' && c!='U'){
                con++;
            }
        }
        return getFact(con);
    }

    public static int getFact(int con){
        if(con<=1) return 1;
        return con*getFact(con-1);
    }
}
