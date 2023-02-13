package Practice_JavaPrograms;

public class Interview_Program {

	public static void main(String[] args) {
//		String s="I am from India";
//		String[] str=s.split(" ");
//		String rev="";
//		for(int i=str.length-1;i>=0;i--)
//		{
//			rev=rev+str[i];
//			System.out.print(" ");
//		}
//		System.out.println(rev);
//		int j=0;
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)!=' ')
//			{
//				System.out.print(rev.charAt(j));
//				j++;
//				
//			}else
//			{
//				System.out.print(" ");
//			}
//		}
		
		
		
		
	String s="My name is sujana";
	String[] str=s.split(" ");
	String rev="";
	for(int i=str.length-1;i>=0;i--)
	{
		rev=rev+str[i];
	}
	//System.out.println(rev);
	int j=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			System.out.print(rev.charAt(j));
			j++;
		}else
		{
			System.out.print(" ");
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
