public class NextHundred01 {
	public static void main(String[] args) {
int num = 123;
	System.out.println(getNextMultipleOf100(num));
		
	}
	
	public static int getNextMultipleOf100(int num) {
	
	if(num <= 0){
		return -1;
	}
	if(num > 0){
		return (num/100+1)*100;
	
                    }
	return num;
           }
       }

	
      