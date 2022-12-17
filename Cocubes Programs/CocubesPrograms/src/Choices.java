import java.util.Scanner;

public class Choices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter ur choices 1.Airthmetic operations, 2.Farnheit and celicius conversions");
int ch=sc.nextInt();

if(ch==1){
	System.out.println("ENter ur choice to calculate airthmetic operations");
	int ch1=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(ch1==1){
		System.out.println(a+b);
	}
	else if(ch1==2){
		System.out.println(a-b);
	}
	else if(ch==3){
		System.out.println(a*b);
	}
	else if(ch==4)
		{
		System.out.println(a/b);
		}
	else System.out.println("Enter values b/w 1-4");
}
else if(ch==2){
	System.out.println("Enter choice 0 or 1");
	int ch1=sc.nextInt();
	if(ch1==0){
		System.out.println("enter farnheit for conversion");
		float fra=sc.nextFloat();
		float f=((fra-32)*5)/9;
		System.out.println(f);
	}
	else if(ch1==1){
		System.out.println("enter celcius for conversion");
		float cel=sc.nextFloat();
		float c=((cel*9)/5)+32;
		System.out.println(c);
		
	}
	else System.out.println("Enter values 0 or 1");
	
}
	}

}
