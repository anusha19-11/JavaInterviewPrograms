package Programs;

public class LargestinArray {

	public static void main(String[] args) {
		int[] arr = { 1, 9, 6,100, 3, 23, 4 };
		int largest = arr[0];
		for(int num:arr) {
			if(num>largest) {
				largest=num;
			}
		}
	
System.out.println("Largest number in Array :" +largest);
}
}