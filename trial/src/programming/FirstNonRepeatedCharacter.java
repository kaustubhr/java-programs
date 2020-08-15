package programming;
import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "goodmorning";
		char[] chrStr = str.toCharArray();
		Map<Character,Integer> s = new HashMap<Character,Integer>();
		for(char i:chrStr) {
			if(!s.containsKey(i)) {
				s.put(i,1);
			}
			else {
				s.put(i, s.get(i)+1);				
			}
			
		}
		for(char i:chrStr) {
			if(s.get(i) == 1) {
				System.out.println("This character "+i+" is the first of the characters which are mentioned just once in the string");
				break;
			}
		}
		
	}

}
