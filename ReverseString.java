package Programs;

public class ReverseString {

	public static void main(String[] args) {
		String str="Anusha";
		StringBuilder reversed=new StringBuilder(str).reverse();
		System.out.println(reversed);

	}

}
//using stringbuffer class
//StringBuffer sb=new StringBuffer(str);
//System.out.println(sb.reverse());