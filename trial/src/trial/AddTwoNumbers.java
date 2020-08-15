package trial;
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers between 1 and 10");
		Scanner read = new Scanner(System.in);
		int firstNumber,secondNumber;
		firstNumber = read.nextInt();
		secondNumber = read.nextInt();
		if(firstNumber>10 || firstNumber<1 || secondNumber<10 || secondNumber<1 )
		{
			System.out.println("Please enter number between 1-10");
			return;
		}
		int z = firstNumber + secondNumber ;
		int results = z + 30;
		System.out.println("Result of two numbers plus 30 is : "+results);
		
	}

}
