package TaskThree;
import java.util.Scanner;

public class RightTrianglePatern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive integer:");
		int inputNumber = input.nextInt();
		for(int i=0;i<inputNumber;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		input.close();
	}

}
