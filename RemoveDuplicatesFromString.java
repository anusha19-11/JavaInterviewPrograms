	package Programs;
	
	import java.util.HashSet;
	import java.util.Set;
	
	public class RemoveDuplicatesFromString {
	
		public static void main(String[] args) {
			String input = "aabbcddee";
			StringBuilder result = new StringBuilder();
			Set<Character> seen = new HashSet<>();
			for (char c : input.toCharArray()) {
				if (!seen.contains(c)) {
					seen.add(c);
					result.append(c);
				}
			}
			System.out.println("Without duplicates:"+result.toString());
	
		}
	
	}
