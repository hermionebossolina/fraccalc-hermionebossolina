
public class FracCalc {

    public static void main(String[] args) 
    {
        // TODO: Call produceAnswer with an equation
        String result = produceAnswer(args[0]);
        System.out.println(result);
      }

	private static int generateGCD(int x, int y) {
		if(y==0) return x;
		return generateGCD(y, x%y);
	}
            

    
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
		String s = input;
		
		int opIndex = -1;
		String op_1 = "";
		/*for(int j = 1; j<s.length();j++){
			if(s.charAt(j)=='+'  || (s.charAt(j)=='-' && s.charAt(j+1) == ' ') || s.charAt(j)== '*' 
			 || (s.charAt(j)== '/' && s.charAt(j-1) == ' ' && s.charAt(j+1) == ' ')){
				if(opIndex != -1) {
					if(op_1.equals("")) op_1 = s.substring(0, opIndex).trim();
					String op_2 = s.substring(opIndex,opIndex+1);
					String op_3 = s.substring(opIndex+1, j).trim();
					op_1 = helper(op_1, op_2, op_3);
				}
				
				opIndex = j;
			}
			
		} */
		int j = -3;
		while( (j = s.indexOf(" ", j+3)) != -1) {
				if(opIndex != -1) {
					if(op_1.equals("")) op_1 = s.substring(0, opIndex).trim();
					String op_2 = s.substring(opIndex,opIndex+1);
					String op_3 = s.substring(opIndex+1, j).trim();
					op_1 = helper(op_1, op_2, op_3);
				}
				
				opIndex = j+1;		    
		  }
		if(op_1.equals("")) 
			op_1 = s.substring(0,opIndex).trim();
		String op_2 = s.substring(opIndex,opIndex+1);
		String op_3 = s.substring(opIndex+1).trim();
		return helper(op_1, op_2, op_3);
       }
    
      private static String helper(String op_1, String op_2, String op_3) {
    	int[] op_1_val = getNumerDem(op_1);
    	int[] op_3_val = getNumerDem(op_3);
    	int whtidenplnum = op_1_val[0];
    	int demi = op_1_val[1];
    	int secwhtidenplnum = op_3_val[0];
    	int dem2 = op_3_val[1];; 
    	
		int ni = 0;
		int nii = 1;
		
		if(op_2.trim().equals("+")){
			 ni = whtidenplnum*dem2+secwhtidenplnum*demi;
			 nii = demi*dem2;  			
		} else if(op_2.trim().equals("-")){
			 ni = whtidenplnum*dem2-secwhtidenplnum*demi;
			 nii = demi*dem2;  
		}else if(op_2.trim().equals("/")){ 
			ni = Math.abs(whtidenplnum)*dem2;
			nii = Math.abs(secwhtidenplnum)*demi;
			int check = whtidenplnum*secwhtidenplnum;
			if(check<0) {
				ni *= -1;
			}
		} else if(op_2.trim().equals("*")){
			 ni = whtidenplnum*secwhtidenplnum;
			 nii = demi*dem2;
		}
		
		String result = "";
		int gcd = generateGCD(Math.abs(ni), Math.abs(nii));
		ni = ni / gcd;
		nii = nii / gcd;
		if(ni % nii == 0) return ""+ (ni / nii);
		if(Math.abs(ni) >= Math.abs(nii)) {
		    int p = (int) (ni / nii);
		    result = p + "_";
		    result += Math.abs(ni) % Math.abs(nii) ;
		} else {
			result += ni;
		}
		result += "/" + nii;
		        
        return result;
    }
    private static int[] getNumerDem(String s) {
		int temp = -1;
		String dem1 = "";
		String numer1 = "";
		String first1 = "";
		for(int i = 0; i<s.length();i++){
			if(s.charAt(i)=='_'){
				first1 = s.substring(0,i);
				temp = i;
			} else if(s.charAt(i)=='/'){
				numer1 = s.substring(temp+1,i);
				dem1 = s.substring(i+1);
			}

		}
		if (temp == -1 && numer1.equals("")){
			first1 = s.substring(0);
		}

		//System.out.println("Whole is: " + first1);
		//System.out.println("Numerator is: " + numer1);
		//System.out.println("Denominator is: " + dem1);
		int demi = 1;
		int numi = 0;
		int whole = 0;
		if(dem1.trim().equals("")){
			numi = Integer.parseInt(first1);
			demi = 1;
		} else{
			demi = Integer.parseInt(dem1);
			numi = Integer.parseInt(numer1);
			if(!first1.equals("")) {
				whole = Integer.parseInt(first1);
			}
		} 
		int whtidenplnum = Math.abs(whole)*demi+numi;
		if(whole<0){
			whtidenplnum *= -1;
		}
    	
		return new int[] {whtidenplnum, demi};
    }
    
}


    // TODO: Fill in the space below with any helper methods that you think you will need
