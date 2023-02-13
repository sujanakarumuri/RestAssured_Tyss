package ArrayConcept;

public class Ass2Prog2PrintDuplicatesInArrayWithCount {

	public static void main(String[] args) {
		int[] a= {1,3,6,3,2,1,6,2};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.println(a[i]);
					count++;
				}
				
			}
		}
		System.out.println("Count="+count);

	}

}
