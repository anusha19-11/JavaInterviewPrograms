package Programs;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		sc.close();
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;

			}

		}

		if (count == 2) {
			System.out.println("It is a prime number");

		} else {
			System.out.println("It is not a prime number");

		}
	}

}
