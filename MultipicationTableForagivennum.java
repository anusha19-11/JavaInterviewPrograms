package Programs;

import java.util.Scanner;

public class MultipicationTableForagivennum {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in) ;
		System. out.println ("Enter required table number");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i <= 10; i++) {
		//5 * 1 = 5
		System.out.println (n+" * "+i+" = "+(n*i));

		 

		}
	}

}
