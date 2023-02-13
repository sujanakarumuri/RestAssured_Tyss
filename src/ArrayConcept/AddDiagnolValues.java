package ArrayConcept;

public class AddDiagnolValues {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {3,4,5};
		int c[]= {5,6,7};
		int fsum=0;
		int ssum=0;
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			for(j=0;j<b.length;j++)
			if(i==j)
			{
				fsum=fsum+a[i]+a[j];
			}else
			{
			int m=i+j;
			if(m<=2)
			{
				ssum=ssum+a[i]+a[j];
			}
			
		}
		}
		System.out.println("fsum="+fsum);
		System.out.println("ssum="+ssum);

	}

}
