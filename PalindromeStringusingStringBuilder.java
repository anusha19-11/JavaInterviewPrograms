package Programs;

public class PalindromeStringusingStringBuilder {

	public static void main(String[] args) {
		String str="Anusha";
		String reversed=new StringBuilder(str).reverse().toString();
		//System.out.println("isPalindrome:"+str.equals(reversed));

		if(str.equalsIgnoreCase(reversed)) {
			System.out.println(str+ "is a Palindrome");
			
		}else {
			System.out.println(str + "is not a Palindrome");	
		}
	}

}
