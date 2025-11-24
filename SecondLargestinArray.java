package Programs;

public class SecondLargestinArray {
 public static void main(String[] args) {
		int[] arr = { 1, 9, 6,100, 3, 23, 4 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;

			}
		}
		System.out.println("Second largest:" + second);
	}

}
