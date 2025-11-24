package Programs;

public class OccurenceofChar {

	public static void main(String[] args) {
		String str = "Mindqsystems";
		int count =0;
		for (int i=0;  i<=str.length()-1; i++) {
			if(str.charAt (i) == 's'){
				count++;
				System.out.println("Index of 's' is: "+i);
			}
		}
			
		System.out.println(count+ "times 's' available");
	}

}
