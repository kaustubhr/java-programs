package arrayString;
import java.lang.*;

public class SwapCases {

	public static void main(String[] args) {
		String str = "heLLo WOrLd";
		char[] charStr = str.toCharArray();
		String finalStr = "";
		for(char i:charStr) {
			if(Character.isUpperCase(i)) {
				finalStr += Character.toLowerCase(i);
			}
			else {
				finalStr += Character.toUpperCase(i);
			}
					
		}
		System.out.println("converted string is: "+finalStr);
		

	}

}
