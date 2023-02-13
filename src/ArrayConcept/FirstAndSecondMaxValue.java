package ArrayConcept;

public class FirstAndSecondMaxValue {

	public static void main(String[] args) {
		
		int[] arr= {1,2,54,98,6,86,98,6,123,980};
//		int fmax=arr[0];
//		int smax=arr[0];
//		for(int i=1;i<arr.length;i++)
//		{
//			if(arr[i]>=fmax)
//			{
//				if(arr[i]!=fmax)
//			{
//				smax=fmax;
//				
//			}
//			fmax=arr[i];
//		}
//		else
//				if(fmax==smax || arr[i]>smax)
//				{
//					smax=arr[i];
//				}
//		}
//		System.out.println("first max value="+fmax);
//		System.out.println("Second max value="+smax);
//		

	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	int m=0;
	for(int i=0;i<arr.length-1;i++)
	{
		
		if(arr[i]!=arr[i+1]) {
			
			System.out.println(arr[i]);
			
			
		}
		
	}
	System.out.println("first max="+arr[0]);
	System.out.println("second max="+arr[1]);
	
	
	
	
	}

}
