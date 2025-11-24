package Programs;

public class PrimeNumbersFrom1to100 {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100 are:");
		for (int n = 1; n <= 100; n++) {
			int count = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					count++;

				}

			}
			if (count == 2)
				;
			{
				System.out.println(n + ",");
			}
		}

	}
}
