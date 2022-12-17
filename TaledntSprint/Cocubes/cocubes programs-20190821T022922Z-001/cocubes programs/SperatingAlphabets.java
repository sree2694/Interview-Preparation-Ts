import java.util.Scanner;

public class SperatingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(SeparatingAlphabets(str));
			}

			private static String SeparatingAlphabets(String str) {
				// TODO Auto-generated method stub
				String c="";
				String d="";
				for(int i=0;i<str.length();i++)
				{
					char a =str.charAt(i);
					
					if(Character.isAlphabetic(a)){
						c+=a;
					}
					else d+=a;
				}
				return d+c;
		}

		
	}


