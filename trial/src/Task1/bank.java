package Task1;
import java.util.Scanner;
import java.util.HashMap;

public class bank{
	
	static String customer ;
    static Float balance;
    static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Do you have an account already? Y/N");
		String answer = in.next();
		if(answer.contains("Y")) {
		System.out.println("Enter your name:");
        System.out.println("1.CheckBalance 2.Withdraw 3.AddBalance 4.RemoveAccount 5.Log out" );
        while(true){
            int choice = in.nextInt();
            switch(choice){
                case 1:CheckBalance();
                    break;
                case 2: Withdraw();
                    break;
                case 3: AddBalance();
                    break;
                case 4: RemoveAccount();
                		break;
                case 5: System.exit(1);
                default:
                    System.out.println("Wrong input");
            }
        }
    }
		else {
			AddAccount();
		}
	}
       
	 private static void RemoveAccount() {
	    	

	    }

    private static void AddBalance() {
    	System.out.println("Enter new amount:");
    	balance += in.nextFloat();

    }

    private static void Withdraw() {

    }

    private static void CheckBalance() {

    }

    private static void AddAccount() {
    	System.out.println("Enter you name:");
    	customer = in.next();
    	System.out.println("Enter you initial balance:");
    	balance = in.nextFloat();
    	
    	
    	
    }

	}


