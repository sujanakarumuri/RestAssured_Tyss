package ArrayConcept;

public class PrintPrimeNumbersInArray {

	public static void main(String[] args) {
		int a[]= {3,5,7,2,4,6,8,7,0};
		for(int i=0;i<a.length;i++)
		{
			//int n=a[i];
			int j=2;
			while(j<=a[i])
			{
				if(a[i]%j==0)
				{
					break;
				}else {
					j++;
			}
		}
		if(j==a[i])
		{
			System.out.println(a[i]);
		}

}
	}
}
		
		
		

		
		
	