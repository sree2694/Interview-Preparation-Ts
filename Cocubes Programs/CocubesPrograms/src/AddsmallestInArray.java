import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddsmallestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={5,7,9,54,1,3};
		System.out.println(sumOfSmallest(arr));

	}

	private static int sumOfSmallest(int[] arr) {
		// TODO Auto-generated method stub
		int sum;
		Arrays.sort(arr);
		sum=arr[0]+arr[1];
		return sum;
	}

}
