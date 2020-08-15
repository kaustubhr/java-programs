package TaskThree;
import java.util.Scanner;

public class MultilplicationTable {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the number");
				int inputNumber = input.nextInt();
				for(int i=1;i<=10;i++) {
					System.out.println(inputNumber + " X "+i+" = "+(inputNumber*i));
				}
				input.close();
	}

}
