package Programs;

public class PalindromeStringwithoutusingStringBuilder {

	public static void main(String[] args) {
		String str="Anusha";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
		reverse=reverse+str.charAt(i);
		
		if(reverse.equalsIgnoreCase(str)) {
			System.out.println("Given string is a palindrome");
		}else {
			System.out.println("Given string is not a palindrome");	
		}

	}

}
}