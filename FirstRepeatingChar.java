package Programs;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		String input="ccaabbcddee";
		Set<Character> set = new HashSet();
		for (char c : input.toCharArray()) {
			if(!set.add(c)) {
				System.out.println("First Repeating Character is:"+ c);
				break;
			}
		}

	}

}
