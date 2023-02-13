package ArrayConcept;

public class ThirdMinimumArray {

	public static void main(String[] args) {
//		int[] arr= {4,11,3,2,5};
//		int temp;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		System.out.println(arr[i]);
//		System.out.println("Third minimum array="+arr[2]);
//
//	}
//
//}

int n=5;
for(int i=n;i>0;i--)
{
	for(int j=1;j<=n;j++)
	{
		if(i<=j)
		{
			System.out.println(" * ");
		}
		else
		{
			System.out.println(" ");
		}
	}System.out.println();
}
}
}
