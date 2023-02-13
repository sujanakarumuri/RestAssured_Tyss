package stringPrograms;

public class Rev_Approaches {

	public static void main(String[] args)
	{
		String s="india";
		int k=s.length()-1;
		String rev="";
		int p;
		for(int i=0;i<s.length();i++)
		{
		    
			 p = k-i;
			rev=rev+s.charAt(p);
			
		}
		
		System.out.println(rev);
	}
}
