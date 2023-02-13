package ArrayConcept;

public class Ass2Prog1RemoveDuplicates {

	public static void main(String[] args) {
		int[] a= {9,4,1,1,5,6,4,9};
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{	for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&i!=j)
				{
					a[i]=0;								
				}			
			}		
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				count++;
				
			}			
		}
		System.out.println("No of unique elements are="+count);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
//		int a2[]=new int[count];
//		int j=0;
//		for(int i=0;i<a.length;i++)
//		{if(a[i]!=0)
//		{
//			a2[j]=a[i];
//		     j++;
//		}
//		}
//		System.out.println("new array without duplicates are");
//		for(int i=0;i<a2.length;i++)
//			System.out.print(a2[i]+" ");
//
//	
	}
}