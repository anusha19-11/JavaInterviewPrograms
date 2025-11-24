package Programs;

public class Stringtrimreplaceloweranduppercase {

	public static void main(String[] args) {
		String str = "MindQ";
		// to convert into lower case
		System.out.println(str.toLowerCase());
		// to convert into upper case
		System.out.println(str.toUpperCase());

		String str2 = "Sr Nagar";

		// to display "Sr Nagar"
		System.out.println(str2.trim());
		// to display "SrNagar"
		System.out.println(str2.replace(" ", ""));

	}

}
