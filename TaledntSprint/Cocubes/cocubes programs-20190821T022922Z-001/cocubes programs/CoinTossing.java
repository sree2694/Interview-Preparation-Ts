
public class CoinTossing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(GetcoinState('T',5));
System.out.println(GetcoinState('H',5));
	}

	public static char GetcoinState(char c, int i) {
		// TODO Auto-generated method stub
		if(c=='T'){
			if(i%2==0){
				return 'T';
			}
			else return 'H';
		}
		else{
			if(i%2==0){
				return 'H';
			}
			else return 'T';
		
		}
	}

}
