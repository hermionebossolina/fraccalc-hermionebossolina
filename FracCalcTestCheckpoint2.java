 

import org.junit.Test;

// Checkpoint 2-only tests
public class FracCalcTestCheckpoint2
{
    public static void main (String []args){
    String s = "11_2/3";
    System.out.println(""+ s.length());
    int index = s.indexOf("-");
        int y = s.indexOf("+");
        String op1 = s.substring(0, index); 
        String op2 = s.substring(index, index+1);
        String op3 = s.substring(index+1);
        int temp = -1;
        String dem = "";
        String numer = "";
        String first = "";
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='_'){
               System.out.println(i+": " + s.charAt(i));
               first = s.substring(0,i);
               temp = i;
           } else if(s.charAt(i)=='/'){
              numer = s.substring(temp+1,i);
              dem = s.substring(i+1);
              System.out.println();
           }
               else{
              
               }
         }
         if (temp == -1 && numer.equals("")){
         first = s.substring(0);
         }
         
         System.out.println(s);
                  System.out.println("Numerator is: " + numer);
                           System.out.println("Denominator is: " + dem);
    }
}
