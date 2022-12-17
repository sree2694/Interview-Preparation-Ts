
public class SumofnumberOddTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,1,2,1,3,2,3,4,4,3,4,4,6};
		System.out.println(sum(arr));

	}

	private static int sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum = 0;
		int a=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count%2!=0){
				
				if(arr[i]!=a){
				sum+=arr[i];
				a=arr[i];}
				else continue;
			}
		}
		return sum;
	}

}
