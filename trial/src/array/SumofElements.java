package array;
import java.util.HashMap;

public class SumofElements {
	
	public static boolean findIfSum(int[] arr, int sum) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			m.put(arr[i],sum-arr[i]);			
		}
		for(Integer i:m.keySet()) {
			if(m.containsKey(m.get(i))) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
		return false;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,4,5,6};
		int sum = 6;
		boolean exists = findIfSum(arr,sum);
		if(exists) {
			System.out.println("elements exists in array whose sum is equal to "+sum);
		}
		else {
			System.out.println("Doesnt exsits");
		}
		
	}

}
