package TaskThree;
import java.util.Scanner;

public class FloatCompare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float first, second;
		System.out.println("Enter two floating numbers:");
		first = input.nextFloat();
		second = input.nextFloat();
		if(Math.abs(second-first) < 0.009) {
			System.out.println("Same upto two decimal places");
		}
		else {
			System.out.println("Not same upto two decimal places");
		}
		input.close();
	}

}
