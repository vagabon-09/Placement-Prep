package Accenture.Question13;

public class EvenOddString {
   public static void main(String[]args){
       int[] arr = {1,2,3,4,5,6};
       String str = getString(arr);
       System.out.println(str);
   }

   public static String getString(int[] arr){
       StringBuilder stb = new StringBuilder();
       for(int n: arr){
           if(n%2==0){
               stb.append("Even");
           }else{
               stb.append("Odd");
           }
       }
       return stb.toString();
   }
}


