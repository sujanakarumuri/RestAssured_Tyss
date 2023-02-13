package stringPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharInAString {

	public static void main(String[] args) {
		
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			//System.out.print(s.charAt(i));
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			System.out.print(ch);
		}

	}

}
