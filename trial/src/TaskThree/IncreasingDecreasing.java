package TaskThree;
import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		int inputNum[] = new int[3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		for(int i=0;i<3;i++) {
			inputNum[i] = input.nextInt();
		}
		if(inputNum[0]>inputNum[1] && inputNum[1]> inputNum[2]) {
			System.out.println("DECREASING");
		}
		else if(inputNum[0]<inputNum[1] && inputNum[1]< inputNum[2]) {
			System.out.println("INCREASING");
		}
		else {
			System.out.println("Neither increasing or decreasing order");
			
		}
		input.close();
	}

}
