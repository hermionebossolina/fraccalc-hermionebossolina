 
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Call produceAnswer with an equation
                // TODO: Call produceAnswer with an equation
                 String s = "11_2/3-4_5/6";
        //String s = "11_2/3 - 4_5/6";
        System.out.println(""+ s.length());
     //   for(int i = 0; i < s.length();i++){
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
         
         System.out.println("Whole is: " + first);
                  System.out.println("Numerator is: " + numer);
                           System.out.println("Denominator is: " + dem);
                           
                
    }

    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
        
        return "";
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}


