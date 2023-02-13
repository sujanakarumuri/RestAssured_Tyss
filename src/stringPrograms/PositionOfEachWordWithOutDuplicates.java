package stringPrograms;

import java.util.LinkedHashSet;

public class PositionOfEachWordWithOutDuplicates   {

	public static void main(String[] args) {
		String str="I Love I Love Banglore";
		String[] s = str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++)
		{
			set.add(s[i]);
			
		}
		for(String str1: set)
		{
			for(int i=0;i<s.length;i++)
			{
			if(str1.equals(s[i]))
			{
				System.out.println(str1+"is present in  "+(i+1)+" position");
				break;
			}
			}
				
		}

	}

}
