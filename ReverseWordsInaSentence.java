package Programs;

public class ReverseWordsInaSentence {

	public static void main(String[] args) {
	String input = "Hello World";
	String[] words = input.split(" ");
	StringBuilder result = new StringBuilder();
	for ( String word : words) {
		result.append(new StringBuilder(word).reverse()).append(" ");
		
	}
System.out.println("Reversed words in a sentence are:"+result.toString().trim());
	}

}
