
public class NonrepitetiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,76,3,5,2};
		int[] arr1={3,7,234,7,5};
		System.out.println(distinctelements(arr,arr1));

	}

	private static int distinctelements(int[] arr, int[] arr1) {
		// TODO Auto-generated method stub
	
		
		String s = "";
		
		for(int i=0;i<arr.length;i++)
			
		{
			int count=1;
			for(int j=0;j<arr1.length;j++){
				if(arr[i]==arr1[j]){
					count++;
				}
			}
			if(count<2){
				s+=arr[i]+",";
			}
		}
	
	
System.out.println(s);
		return s.length();
	}

}
