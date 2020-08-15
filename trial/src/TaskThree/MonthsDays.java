package TaskThree;
import java.util.Scanner;
public class MonthsDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month number(1-12):");
		int monthNumber = input.nextInt();
		if(monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 ||
				monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
			System.out.println("31 Days");
		}
			else if(monthNumber == 2 || monthNumber == 4 || monthNumber == 6 ||
					monthNumber == 9 || monthNumber == 11) {
				System.out.println("30 Days");
			}
			
			else if(monthNumber==2) {
				System.out.println("28/29 Days");
			}
			else {
				System.out.println("Invalid Details");
			}
		input.close();
	}

}
