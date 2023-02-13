package stringPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateWords{

	public static void main(String[] args) {
		String s="I Love I Love Banglore City";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
		for(String str1: set)
		{
			System.out.print(str1+" ");
		}

	}

}
