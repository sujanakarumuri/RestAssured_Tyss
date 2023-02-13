package ArrayConcept;

import java.util.LinkedHashSet;

public class Ass3Prog7NoOfVowelsWithOutDuplicates {

	public static void main(String[] args) {
		String st="india";
		char[] c=st.toCharArray();
		int count=0;
//		
//		for(int i=0;i<c.length;i++)
//		{
//			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
//				count++;
//			System.out.print(c[i]);
//				
//		}
//		System.out.print(count);
//		
		
		
		//By using Linked Hash Table
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++)
		{
			set.add(c[i]);
		}
		for(Character s:set)
		{
			if(s =='a' || s=='e' || s=='i' || s=='o' || s=='u')
			{
				count++;
				System.out.print(s);
			}
			
		}
		System.out.print(" = "+count);

	}

}
