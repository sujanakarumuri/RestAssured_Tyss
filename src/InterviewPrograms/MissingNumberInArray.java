package InterviewPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] a= {1,4,9,14};
		int n=0;
		for(int i=0;i<=15;)
		{
			int m=a[i+1]-a[i];
			if(m>1)
			{
				n=a[i]+1;
				System.out.println(n);
				i=i++;
				a[i]=n;
				
			}
			else
			{
				n=a[i]+2;
				System.out.println(n);
				i=i+1;
				a[i]=n;
				
				
			}
		}

	}

}
