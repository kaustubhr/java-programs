package arrayString;

public class ShortestWord {

	public static void main(String[] args) {
		String[] words = {"hello","hi","bye","welcome"};
		int min = Integer.MAX_VALUE;
		for(String i:words) {
			if(i.length() < min) {
				min = i.length();
			}
		}
		System.out.println("Length of shortest word is: "+min);
		
	}

}
