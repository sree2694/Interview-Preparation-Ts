
public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(buy(5,120,6,130));
	}

	private static int buy(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		int sell,diff;
		int buy;
		if(i>k){
			buy=l/k;
			diff=i-k;
			return (buy*diff)+l;
		}
		else {
			sell=l/k;
			diff=k-i;
			System.out.println(k-diff);
			return l-(sell*diff);
		}
	}

}
