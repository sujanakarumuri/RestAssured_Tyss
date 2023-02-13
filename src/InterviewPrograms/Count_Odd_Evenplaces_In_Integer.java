package InterviewPrograms;

public class Count_Odd_Evenplaces_In_Integer {

	public static void main(String[] args) {
		int a=133771;
		int odd=0;
		int even=0;
		int sum=0;
		while(a>0)
		{
			int b=a%10;
			int c=a/10;
			if(b%2==0)
			{
				even=even+b;
			}
			else
			
				odd=odd+b;
				a=c;
		}
			System.out.println("even="+ even);
			System.out.println("odd="+odd);
			
			
		

	}

}
