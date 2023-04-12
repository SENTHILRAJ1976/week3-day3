package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInteger {

	public static void main(String[] args) {


		int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
		
		
		
		Set<Integer> dupli = new HashSet<Integer>();
		
		for (Integer i : num) {
			
			dupli.add(i);
			
		}
		
		System.out.println(dupli);
		
	}

}
