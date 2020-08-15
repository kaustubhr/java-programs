package TaskThree;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any year:");
		int year = input.nextInt();
		if(year%4 != 0) {
			System.out.println("Not a leap year");
		}
		else if(year%400==0) {
			System.out.println("Leap year");
		}
		else if(year%100 ==0) {
			System.out.println("Not a leap year");
		}
		else {
			System.out.println("Leap year");
		}
		input.close();
	}

}
