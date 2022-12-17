
public class Findexponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(finExponent(2,256));

	}

	private static int finExponent(int i, int j) {
		// TODO Auto-generated method stub
		int k=1,l=i;
		if(j==1){
			return 0;
		}
		while(j>i){
		if(l==j){
			
			break;
		
		}
		else{
			l*=i;
			
			k++;
			
			continue;
			
		}
		}
		return k;
		
	}

}
