package Programs;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,3,4,5,6};
		int n = 6;
		int sum = n*(n+1)/2;
		for ( int num : arr) {
			sum-= num;
		}
System.out.println("Missing number is:"+sum);
	}

}
