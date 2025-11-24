package Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDO {

	public static void main(String[] args) {
		Integer array[]= {1,3,2,4,0};
		
		Arrays.sort(array,Collections.reverseOrder());
	
			System.out.print(Arrays.toString(array));
		}

	}


