import java.util.Scanner;

public class StringsLOwer2UpperorUpper2lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan=new Scanner(System.in);
		String str=Scan.nextLine();
		String s="";
		for(int i=0;i<str.length();i++){
			
		
		char c=str.charAt(i);
		
		if(Character.isUpperCase(c)){
		s+=	Character.toLowerCase(c);
			
		}else s+=Character.toUpperCase(c);
		
		

	}
		
		System.out.println(s);
}
}
