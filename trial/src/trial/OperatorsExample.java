package trial;
import java.util.Scanner;

public class OperatorsExample {

	public static void main(String[] args) {
		int option,first,second,first1,second1,result;
		System.out.println("1.Addition 2.Subtraction 3.Division 4.Multiplication 5.Average");
		Scanner input = new Scanner(System.in);
		option = input.nextInt();
		System.out.println("Enter two numbers:");
		first = input.nextInt();
		second = input.nextInt();
		result = 0;
		switch(option) {
		case 1: result = first+second;
				break;
		case 2: result = first-second;
				break;
		case 3: result = first * second;
				break;
		case 4: if(second!=0) {result = first / second;}break;
		case 5: System.out.println("Enter two more numbers:");
				first1 = input.nextInt();
				second1 = input.nextInt();
				result = first/4 + second/4 + first1/4 + second1/4 ;
				break;
		}
		System.out.println(result);
		if(result<0) {
			System.out.println("Oops option "+option+" is returning the negative number");
		}
		return;
		

	}

}
