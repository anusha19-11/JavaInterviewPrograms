package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String input="aabbcddee";
		Map<Character,Integer> map = new LinkedHashMap<>();
		for (char c : input.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for (char c :map.keySet()) {
			if (map.get(c)==1) {
				System.out.println("First non repeated character is:" +c);
			}
		}
		
	}

}
