package InterviewPrograms;

public class AddIntegersBasedOnPositions {

	public static void main(String[] args) {
		int a=133772;
		int even=0;
		int odd=0;
		int n=0;
		String str = Integer.toString(a);
		String[] s = str.split("");
		for(int i=0;i<s.length;i++)
		{   n=Integer.parseInt(s[i]);
			if(i%2==0)
			{
				
				even=even+n;
			}else
			{
				odd=odd+n;
			}
		}System.out.println("even="+even);
		System.out.println("odd="+odd);
		if(even==odd)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		

	}
}




























