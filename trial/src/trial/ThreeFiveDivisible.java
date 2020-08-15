package trial;
import java.util.Scanner;

public class ThreeFiveDivisible {

	public static void main(String[] args) {
		int inputInteger;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer");
		inputInteger = input.nextInt();
		if(inputInteger%3==0 && inputInteger%5==0) {
			System.out.println("Consultadd JAVA Training");			
		}
		else if(inputInteger%3==0) {
			System.out.println("Consultadd");
		}
		else if(inputInteger%5==0) {
			System.out.println("JAVA Training");
		}
		
	}

}
