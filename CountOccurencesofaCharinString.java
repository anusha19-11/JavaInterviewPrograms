package Programs;

public class CountOccurencesofaCharinString {

	public static void main(String[] args) {
		String str="Annnuusha";
		char ch='u';
		int count=0;
		for(char c:str.toCharArray()) {
			if(c==ch)count++;
		}
System.out.println(count);
	}

}
