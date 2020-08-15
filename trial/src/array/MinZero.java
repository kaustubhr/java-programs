package array;

public class MinZero {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,0,-5};
		int sum,min1=0,min2=0;
		int minimum=Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                sum = Math.abs(arr[i] + arr[j]);
                if(sum < minimum)
                {
                    min1 = i;
                    min2 = j;
                    minimum = sum;
                }
            }
        }
        System.out.println("Element 1:"+arr[min1]); 
        System.out.println("Element 2:"+arr[min2]);
    }

	}


