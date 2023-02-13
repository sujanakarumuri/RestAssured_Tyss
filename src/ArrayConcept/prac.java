package ArrayConcept;

import java.util.LinkedHashSet;

public class prac {

	public static void main(String[] args) {
   String str="tester";
   LinkedHashSet<Character> set=new LinkedHashSet<Character>();
   for(int i=0;i<str.length();i++)
   {
	   set.add(str.charAt(i));
   }
   for(Character c:set)
   {
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   if(c==str.charAt(i))
		   {
			   System.out.println(c+" "+(i+1));
		   }
	   }
   }
  
	}
	

}
