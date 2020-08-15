package TaskThree;
import java.util.Scanner;

public class MonthYear {

	public static void main(String[] args) {
		int days;
		Scanner input = new Scanner(System.in);
		System.out.println("Input a month number");
		int month = input.nextInt();
		System.out.println("Input the year");
		int year = input.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12) {
			System.out.println("31 Days");
		}
			else if(month == 2 || month == 4 || month == 6 ||
					month == 9 || month == 11) {
				System.out.println("30 Days");
			}
			
			else if(month==2) {
				System.out.println("28/29 Days");
			}
			else {
				System.out.println("Invalid Details");
			}
		input.close();
	}

}
