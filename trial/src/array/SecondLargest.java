package array;
import java.util.Arrays;
public class SecondLargest {
	public static int secondLargest(int[] arr) {
		int length = arr.length;
		if(length==0) {
			return 0;
		}
		if(length==1) {
			return 1;
		}
		Arrays.sort(arr);
		int sMax = length-2;
		return sMax;		
	}

	public static void main(String[] args) {
		int[] arr = {11,23,1,0,-9};
		int answer = secondLargest(arr);
		System.out.println(arr[answer]);
	}

}
