package PatternsConcepts;

public class sumOfIntegersWithoutLoop {

	public static void main(String[] args) {
		int num=5678;
		int sum=0;
		sum=add(num);
		System.out.println(sum);

	}
	static int add(int num)
	{
		if(num==0)
		{
			return 0;
		}
		int lastdigit=num%10;
		return lastdigit+add(num/10);
	}

}
