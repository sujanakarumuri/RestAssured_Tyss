 package stringPrograms;

import java.util.LinkedHashSet;

public class OccuranceOfEachCharecter {

	public static void main(String[] args) {
		String s="tester";
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			//System.out.println(set);
		}
		for(char ch:set)
		{
			
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
					
				}
			}
		
		System.out.println(ch+" repeating "+ count+" times");
		}

	}

}
