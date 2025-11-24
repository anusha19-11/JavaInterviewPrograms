package Programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str =" A n U s h a";
		String result= str.replaceAll("\\s", "");
		System.out.println(result);

	}

}
