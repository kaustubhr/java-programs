package trial;
import java.util.Scanner;
public class ConditionalOddEven {

	public static void main(String[] args) {
		System.out.println("Enter any integer below:");
		Scanner input = new Scanner(System.in);
		int inputNumber = input.nextInt();
		if(inputNumber%2 == 1) {
			System.out.println("NEW");
		}
		else if(inputNumber>=2 && inputNumber<=5) {
			System.out.println("OLD");
		}
		else if(inputNumber>=6 && inputNumber<=30) {
			System.out.println("NEW");
		}
		else if(inputNumber>30) {
			System.out.println("OLD");
		}
		input.close();
	}
	

}
