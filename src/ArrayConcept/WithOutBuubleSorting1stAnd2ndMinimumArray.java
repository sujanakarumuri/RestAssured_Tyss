package ArrayConcept;

public class WithOutBuubleSorting1stAnd2ndMinimumArray {

	public static void main(String[] args) {
		int[] arr= {2,3,9,5,1};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("First minimum value="+arr[0]);
		System.out.println("Second minimum value="+arr[1]);
	}

}
