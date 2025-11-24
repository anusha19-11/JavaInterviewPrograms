package Programs;

import java.util.Scanner;

public class ReverseStringwithoutBuiltinmethods {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String originalString= scanner.nextLine();
		String reversedString="";
		//iterate from the last character
		for(int i=originalString.length()-1;i>=0;i--) {    // strlength - 1 is the arraylen
			
			//get the character at the current index
			char character =originalString.charAt(i);
			//append the character to the reversed string
			reversedString = reversedString+character;
		}
		System.out.println("Original string:" +originalString);
		System.out.println("Reversed string:" +reversedString);
	}

}

//2. char a[]=str.toCharArray();  int len=a.length; for(int i=len-1;i>=0;i--) {rev = rev+a[i];}
