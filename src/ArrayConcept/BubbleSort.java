package ArrayConcept;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {61,35,473,12,7};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[1]);
		System.out.println(a[2]);

	}

}
