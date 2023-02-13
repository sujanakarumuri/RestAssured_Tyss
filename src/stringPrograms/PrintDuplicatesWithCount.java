package stringPrograms;

import java.util.LinkedHashSet;

public class PrintDuplicatesWithCount {

	public static void main(String[] args) {
		String s="I Love India I Love Banglore";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String ch:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(ch.equals(str[i]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch+"  is repeating "+count+" times");
			}
		}

	}

}
