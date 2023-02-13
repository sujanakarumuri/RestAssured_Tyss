package stringPrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="malayalam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println();
			System.out.println("String is palindrome="+ rev);
		}
		else
		{
			System.out.println();
			System.out.println("String is not plaindrome"+rev);
		}
		
		
//		
//		String str="mom";
//		String temp="";
//
//		for(int i=str.length()-1;i>=0;i--)
//		{
//		temp=temp+str.charAt(i);
//		}
//		System.out.println(temp+"=temp");
//		
//		System.out.println(str+"=str");
//		
//		if(str==temp)
//		{
//		System.out.println("String is palindrome");
//		}
//		else
//		{
//			System.out.println("String is not palindrome");
//		}

		


	}

}
