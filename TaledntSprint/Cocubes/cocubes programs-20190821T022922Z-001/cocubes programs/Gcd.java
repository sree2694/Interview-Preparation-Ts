
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Gcd1(54,24));
	}

	private static int Gcd1(int i, int j) {
		// TODO Auto-generated method stub
		if(j ==0){
			return i;
		}
		return Gcd1(j, i%j);
	}

}
