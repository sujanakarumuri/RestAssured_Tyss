package ArrayConcept;

public class MutiplyValuesInArrya {
	
	public static void main(String[] args)
	{	
	int[] arr= {2,4,6,32,13,11};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
  			}
		}
	}
	for(int i=0;i<arr.length;i++)
	System.out.println(arr[i]);
	
	System.out.println("Multiply of first 3 values");
	int mul=1;
	for(int j=0;j<3;j++)
	{
		mul=mul*arr[j];
	}
	System.out.println(mul);

}
	


}
