public class Polindrome01 {
	public static void main(String[] args) {
		int num = 878;
		System.out.println(isPolindrome(num));
	}

	public static int isPolindrome(int num) 
	{

		int reversedInteger = 0, remainder; 
		int originalInteger = num;
		
		while (num != 0) 
		{
			remainder = num % 10;
			reversedInteger = (reversedInteger * 10) + remainder;
			num /= 10;
			
		}
		
		System.out.println("reversedInteger:"+reversedInteger);
		System.out.println("original:"+originalInteger);
		System.out.println(originalInteger==reversedInteger);
		if(originalInteger<0 || !(originalInteger>=100 && originalInteger<=999))
		{
			return -1;
		}
		else if(originalInteger>=100 && originalInteger<=999 && originalInteger==reversedInteger)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	}
}
