package stringPrograms;

import java.util.LinkedHashSet;

public class OccuranceOfEachWord {

	public static void main(String[] args) {
		String s="I Love I Love Banglore City City";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String str1:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(str1.equals(str[i]))
				{ count++;
				
				}
			}
			System.out.println(str1+ " repeataing .."+count+" times");
		}

	}

}
