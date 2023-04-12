package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "google";
		
		char[] charArray = str.toCharArray();
		
		String str1 = "";
		
		Set<Character> char1 = new LinkedHashSet<Character>();
		
		for (Character i : charArray) {
			char1.add(i);
		
		}
		
		List<Character> lis = new ArrayList<Character>(char1);
		for (int i = 0; i < lis.size(); i++) {
		
			str1 = str1+lis.get(i);
		}
		
		
		
		
		
		System.out.println(str1);
		

	}

}
