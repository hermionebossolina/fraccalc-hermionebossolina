 

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
{
    public static void main (String []args){
     String s = "1_2/3 - 4_5/6";
     int in = s.indexOf(" ");
     String op_1 = s.substring(0,in);
     String op_2 = s.substring(in,in+3);
     String op_3 = s.substring(in+3);
     //System.out.println(op_1);
     //System.out.println(op_2);
     System.out.println(op_3);
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
