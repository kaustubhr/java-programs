package TaskThree;
import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers below:");
		float sum=0, avg=0;
		for(int i=0;i<10;i++) {
			sum = sum + input.nextFloat();						
		}
		avg = sum/10;
		System.out.println("Sum = "+sum+" and Avg = "+avg);
		input.close();
	}

}
