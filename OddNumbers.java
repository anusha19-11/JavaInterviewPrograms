package Programs;

public class OddNumbers {

	public static void main(String[] args) {
		int limit = 100;
		System.out.println("Odd numbers upto :"+ limit);
		for (int i=1;i<=limit;i++) {
			if (i % 2!=0){
				System.out.println(i);
			}
		}
	}

}
