package array;

public class MoveZero {

	public static void main(String[] args) {
		int arr[] = {0,0,10,0,30,0,40,0,60,80};
		int length = arr.length;
		int i=0,j=0;
		while(i<length) {
			
			if(arr[i] == 0) {
				i++;
			}
			else {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
				i++;				
			}
		}
		for(i=0;i<length;i++) {
			
		System.out.print(arr[i]+" ");
		}

	}

}
