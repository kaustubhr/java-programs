package arrayString;

import java.util.Arrays;

public class SumWithoutExtremes {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		long sum=0;
		if(arr.length<=2) {
			System.out.println("0");
			return;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(i==0||i==arr.length-1) {
				continue;
			}
			else {
				sum+= arr[i];
			}
		}
		System.out.println("Modified Sum of elements is: "+sum);

	}

}
