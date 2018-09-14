 

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
{
    public static void main (String []args){
     String S = "1_2/3 - 4_5/6";
     String s = S;
     int in = s.indexOf(" ");
     String op_1 = s.substring(0,in);
     String op_2 = s.substring(in,in+3);
     String op_3 = s.substring(in+3);
     System.out.println("op_1: " + op_1);
     System.out.println("op_2: " +op_2);
     System.out.println("op_3: " + op_3);
     String ss = op_1; 
      int temp = -1;
        String dem1 = "";
        String numer1 = "";
         String first1 = "";
        for(int i = 0; i<ss.length();i++){
            if(s.charAt(i)=='_'){
               System.out.println(i+": " + ss.charAt(i));
               first1 = ss.substring(0,i);
               temp = i;
           } else if(ss.charAt(i)=='/'){
              numer1 = ss.substring(temp+1,i);
              dem1 = ss.substring(i+1);
              System.out.println();
           }
               else{
              
               }
         }
         if (temp == -1 && numer1.equals("")){
         first1 = ss.substring(0);
         }
         
         System.out.println("Whole is: " + first1);
                  System.out.println("Numerator is: " + numer1);
                           System.out.println("Denominator is: " + dem1);
                           int demi = Integer.parseInt(dem1);
                           int numi = Integer.parseInt(numer1);
                           int whole = Integer.parseInt(first1);
                            int whtidenplnum = whole*demi+numi;
                            System.out.println("whtidenplnum: " + whtidenplnum);
                            System.out.println("whtidenplnum divide denominator: " +  whtidenplnum + "/" + demi);
                            
        String es = op_3;
        temp = -1;
        String  dem = "";
        String numer = "";
        String first = "";
        for(int i = 0; i<es.length();i++){
            if(es.charAt(i)=='_'){
               System.out.println(i+": " + es.charAt(i));
               first = es.substring(0,i);
               temp = i;
           } else if(es.charAt(i)=='/'){
              numer = es.substring(temp+1,i);
              dem = es.substring(i+1);
              System.out.println();
           }
               else{
              
               }
         }
         if (temp == -1 && numer.equals("")){
         first = es.substring(0);
         }
         
         System.out.println("Whole is: " + first);
                  System.out.println("Numerator is: " + numer);
                           System.out.println("Denominator is: " + dem);
                          int dem2 = Integer.parseInt(dem);
                          int num2 = Integer.parseInt(numer);
                          int whole2 = Integer.parseInt(first);
                           int secwhtidenplnum = whole2*dem2+num2;
                            System.out.println("whtidenplnum: " + secwhtidenplnum);
                            System.out.println("whtidenplnum divide denominator: " +  secwhtidenplnum + "/" + dem2);
        if(op_2 == "+"){
            int l = Integer.parseInt(ss);
            int f = whtidenplnum*dem2+secwhtidenplnum*demi;
            int fi = demi*dem2;  
            System.out.println("+"+f+"/"+fi);
        }
        if(op_2 == "-"){
            
        }
        if(op_2 == "/"){
            
        }
        if(op_2 == "*"){
            
        }
        
     /*System.out.println(""+ s.length());
      int index = s.indexOf("-");
        int y = s.indexOf("+");
        String op1 = s.substring(0, index); 
        String op2 = s.substring(index, index+1);
        String op3 = s.substring(index+1);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);*/
        
    }

}
