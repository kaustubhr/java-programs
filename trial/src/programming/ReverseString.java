package programming;

public class ReverseString {

	public static void main(String[] args) {
		String str = "HelloWorld";
		String finalStr = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			finalStr += str.charAt(i);
		}
		System.out.println("reverse string is "+finalStr);

	}

}
