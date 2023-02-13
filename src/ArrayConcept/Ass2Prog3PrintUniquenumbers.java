package ArrayConcept;

public class Ass2Prog3PrintUniquenumbers {

	public static void main(String[] args) {
		int[] a= {2,4,1,4,3,2,6,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					a[i]=0;
				}
			}
		}
		System.out.println("Unique numbers are");
		for(int i=0;i<a.length;i++)
		if(a[i]!=0)
			System.out.println(a[i]);

	}

}
