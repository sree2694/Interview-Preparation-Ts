import java.util.Arrays;

public class ModifyLeastnumBers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={100,200,150,120,110,500};
System.out.println(ModifyLeast(arr));
	}

	public static int ModifyLeast(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for(int i=0;i<2;i++){
			int a=arr[i]/100;
			arr[i]=a*9;		}
		
		
		
		System.out.println(arr[2]);
		return arr[1];
	}
	

}
