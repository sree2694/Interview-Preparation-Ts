

public class RangeWithStep {
	private static final int String = 0;
	public static void main(String[] args) {
        int n1 = 1;
        int n2 = 20;
        int step = 23;
        System.out.println(getNumbersInRange(n1, n2, step)); 
    }
	public static String getNumbersInRange(int num1, int num2, int step) {
		if (num1<0 || num2<0 || step<0){
			int result = -1;
			String str = Integer.toString(result);
			
			return str;
			 
		}else if(num1==num2){
			int result = -2;
			String str = Integer.toString(result);
			
			return str;
			
		}
		else if (num1<num2 && step<num2){
			for (int num11 = num1; num1 <= num2; num11=(num11+step))
	        {
				
	        System.out.print( num11 + " ");
	        
	          
	         
	         
	         
		}
		}
			else {
				
			
				int result = -3;
				String str = Integer.toString(result);
				
				return str;	
			
			}
		return null;
		
		
		
		
		
		
		
		
	   
	
		
	}
}



