package Programs;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateElementsinArray {

	public static void main(String[] args) {
		int arr[] = { 1,1, 2,2, 33, 33, 4,5,4, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print("Duplicates:"  +entry.getKey());
			}

		}

	}

}
