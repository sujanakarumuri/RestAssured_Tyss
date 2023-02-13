package InterviewPrograms;

public class Program1 {

	public static void main(String[] args) {
		String s="you are an employee";
		String[] str=s.split(" ");
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		for(int i=0;i<str.length;i++)
		{
			
			String str2=str[i];
			for(int j=str2.length()-1;j>=0;j--)
			{
				System.out.print(str2.charAt(j));
			}
			System.out.println();
		}
		
		
		

	}

}
