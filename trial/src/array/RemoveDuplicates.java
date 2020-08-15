package array;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {2,2,3,3,4,4,4,11,11,11,11};
		Arrays.sort(arr);
		int length = arr.length;
		for(int i=0;i<length-1;i++) {
			if(arr[i]==arr[i+1]) {
				arr[i]=0;
			}
			
		}
		int i=0,j=0;
		int[] temp = new int[length];
		while(i<length) {
			if(arr[i]!=0) {
				temp[j]=arr[i];
				j++;
				i++;
			}
			else {
				i++;
			}
		}
		for(i=0;i<length;i++) {
			System.out.print(temp[i]+" ");
		}

	}

}
