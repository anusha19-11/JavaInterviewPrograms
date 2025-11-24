package Programs;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsinTwoArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 3, 4, 5, 6, 7, 8 };
		Set<Integer> set = new HashSet<>();
		for (int x : a) {
			set.add(x);
		}
		for (int y : b) {
			if (set.contains(y)) {
				System.out.println(y + " ");
			}
		}
	}

}
