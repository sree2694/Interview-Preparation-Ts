
public class SumOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(1,10));
	}

	private static int sum(int i, int j) {
		// TODO Auto-generated method stub
	int sum = 0;
	for(int k=i;k<=j;k++){
		if(k%3==0){
			sum+=k;
		}
		else if(k%5==0){
			sum+=k;
		}
	}
	return sum;
	}

}
