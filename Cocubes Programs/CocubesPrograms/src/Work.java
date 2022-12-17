
public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(WorkLeft(50,5,2,7,3));
	}

	private static int WorkLeft(int work,  int d1, int f1 ,  int d2, int f2) {
		// TODO Auto-generated method stub
		int workleft = 0,f1workdone,f2workdone;
		f1workdone =f1*d1;
		f2workdone=f2*d2;
		workleft=work-(f1workdone+f2workdone);
		return workleft;
		
		
	}

}
