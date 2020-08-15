package TaskThree;
import java.util.Scanner;

public class SumOfInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any positive natural number");
		int inputNumber = input.nextInt();
		if(inputNumber<0) {
			System.out.println("Please enter positive number");
			input.close();
			return;
		}
		long sum=0;
		for(int i=1;i<=inputNumber;i++) {
			sum = sum + i;
			System.out.print(i+" ");
		}
		System.out.print("\n");
		System.out.println("Sum of "+inputNumber+" natural numbers: "+sum);
		
		input.close();
	}

}
