package trial;
import java.util.Scanner;

public class ReadFloat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float inputNumber = input.nextFloat();
		if(inputNumber==0) {
			System.out.println("zero");
		}
		else if(inputNumber<0) {
			System.out.println("negative");
		}
		else {
			System.out.print("positive");
			if(inputNumber<1) {
				System.out.print(" small");
			}
			else if(inputNumber>1000000) {
				System.out.print(" large");
			}
		}
		input.close();

	}

}
