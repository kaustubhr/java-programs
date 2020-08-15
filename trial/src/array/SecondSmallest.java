package array;
import java.util.Arrays;
public class SecondSmallest {
	public static int secondSmallest(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;
		}
		if(length==1) {
			return 1;
		}
		Arrays.sort(arr);
		return 1;		
	}

	public static void main(String[] args) {
		int[] arr = {11,23,1,5,-9};
		int answer = secondSmallest(arr);
		System.out.println(arr[answer]);
	}

}
