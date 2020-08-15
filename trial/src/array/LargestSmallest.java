package array;

public class LargestSmallest {

	public static void main(String[] args) {
		int[] arr= {1,2,-1,5};
		int length = arr.length;
		if(length<1)
			return;
		if(length==1) {
			System.out.println("0");
			return;
		}
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Difference between max "+max+" and min "+min+" is "+(max-min));
	}

}
