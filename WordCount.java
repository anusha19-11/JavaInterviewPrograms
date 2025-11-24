package Programs;

public class WordCount {

	public static void main(String[] args) {
		String sentence = "My name is Anusha";
		String[] words =sentence.trim().split("\\s+");
		System.out.println("Word Count:" +words.length);
	}

}
