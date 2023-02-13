package ArrayConcept;

public class AddTheNumbersWithOutLoop {

	static int sum(int m)
	{
		int sumvalue=0;
		if(m>9)
		{
			int value=m%10;
			sumvalue=sumvalue+value;
			m=m/10;
			sum(m);
		}
		return sumvalue;
		
	}
	public static void main(String[] args) {
		{
			int n=245;
			int p=sum(n);
			System.out.println(p);
			
		}

	}

}
