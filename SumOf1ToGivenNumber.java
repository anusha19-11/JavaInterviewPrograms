package Programs;

import java.util.Scanner;

public class SumOf1ToGivenNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int number=sc.nextInt();
		sc.close();
		int sumOf=0;
		for(int i=1; i <= number; i++) {
			sumOf=sumOf+i;
		}
		System.out.println("Sum of 1 to "+number+" is: "+sumOf);

		
	}

}
