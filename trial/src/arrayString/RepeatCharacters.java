package arrayString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatCharacters {
	public static boolean repeat(String str) {
		char[] chars = str.toCharArray();
		Set<Character> m = new HashSet<Character>();
		for(Character i: chars) {
			if(!m.contains(i)) {
				m.add(i);
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "Hhelo";
		boolean bool = repeat(str);
		if (bool) {
			System.out.println("Does not contain repeating characters");
		}
		else {
			System.out.println("Contains repeating characters");
		}

	}

}
