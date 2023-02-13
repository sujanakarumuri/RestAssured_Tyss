package stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
//		using length method
//		String s="welcome";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.println(s.charAt(i));
//		}
		
		
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
//			

//		By using count
//		String st="welcome";
//		char[] s=st.toCharArray();
//		int count=0;
//		for(char c:s)
//		{
//			count++;			
//		}
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.println(s[i]);
//		}
		
		String s="welcome";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		
		
	}

}
