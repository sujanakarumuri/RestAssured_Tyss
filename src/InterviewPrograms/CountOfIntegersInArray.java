package InterviewPrograms;

public class CountOfIntegersInArray {

	public static void main(String[] args) {
		String s="This is m5y password=1234";		
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int ch = s.charAt(i)-48;
			   sum=sum+ch;
			     
				
			}
		}
		System.out.println(sum);
		


	}

	

}
