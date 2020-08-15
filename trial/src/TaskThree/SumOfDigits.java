package TaskThree;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer number:");
		long inputNumber = input.nextLong();
		long sum = 0;
		int numDigits = 0;
		while(inputNumber!=0) {
			sum += inputNumber%10;
			numDigits++;
			inputNumber/=10;			
		}
		System.out.println("Number of Digits: "+numDigits);
		System.out.println("Sum of Digits : "+sum);
		input.close();
	}

}
