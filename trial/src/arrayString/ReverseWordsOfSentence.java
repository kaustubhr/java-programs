package arrayString;
import java.util.*;
import java.lang.*;
public class ReverseWordsOfSentence {
	
	
	public static void main(String[] args) {
		String str = "Be Happy and Stay Motivated";
		String finalStr="";
		String[] words = str.split(" ");
		for(String i:words) {
			finalStr += new StringBuilder(i).reverse().toString()+" ";
		}
		System.out.println(finalStr);
	}

}
