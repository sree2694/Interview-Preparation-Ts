import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(SeparatingAlphabets(str));
			}

			private static String SeparatingAlphabets(String str) {
				// TODO Auto-generated method stub
				
				String s=str.replace('a', 'p');
				return s;
				
				
		}

		

	}

