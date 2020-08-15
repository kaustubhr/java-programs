
package trial;
import java.util.Scanner;
public class PrintInput {

	public static void main(String[] args) {
		System.out.println("Enter a value");
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		System.out.println("You entered "+number);
		reader.close();
	}

}
