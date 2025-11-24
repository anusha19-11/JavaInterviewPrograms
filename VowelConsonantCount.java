package Programs;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String input = "Hello World".toLowerCase();
		int vowels = 0;
		int consonants = 0;
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				if ("aeiou".indexOf(c) != -1) {
					vowels++;
				} else {
					consonants++;

				}
			}

		}
System.out.println("Vowels:"+vowels+" ,Consonants:" +consonants);
	}
}
