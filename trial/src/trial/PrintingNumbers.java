package trial;

public class PrintingNumbers {

	public static void main(String[] args) {
		for(int a=0;a<=6;a++) {
			if(a!=0 && a%3==0) {
				continue;
			}
			System.out.print(a+" ");
		}

	}

}
