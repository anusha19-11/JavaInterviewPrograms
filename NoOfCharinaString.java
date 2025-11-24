package Programs;

public class NoOfCharinaString {

	public static void main(String[] args) {
		String str = "Sr Nagar";
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println("Number of characters are: " + count);

	}

}
