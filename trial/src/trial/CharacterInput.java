package trial;
import java.util.Scanner;

public class CharacterInput {

	public static void main(String[] args) {
		String str="randomRANDOM";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any character:");
		char inputChar = input.next().charAt(0);
		if(str.contains(Character.toString(inputChar))) {
			System.out.println("FOUND");			
		}
		else {
			System.out.println("NOT FOUND");
		}
		input.close();
	}

}
