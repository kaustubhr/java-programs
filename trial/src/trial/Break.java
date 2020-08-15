package trial;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		int inputNumber;	
		System.out.println("Start entering numbers below:");
		Scanner input = new Scanner(System.in);
		
		while(true) {
			inputNumber = input.nextInt();
		
			if(inputNumber<0) {
			System.out.println("It's over");
			break;
		}
			else {
				
			
			System.out.println("Good Going");
			continue;
			}
		}
		input.close();
	}

}
