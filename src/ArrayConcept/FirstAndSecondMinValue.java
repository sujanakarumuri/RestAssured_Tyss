package ArrayConcept;

public class FirstAndSecondMinValue {

	public static void main(String[] args) {
		
		int[] arr= {1,2,54,98,6,86,98,6};
		int fmin=arr[0];//fmin=1
		int smin=arr[0];//smin=1
		for(int i=0;i<arr.length;i++)//i=0,i<7
		{
			if(arr[i]<=fmin) //arr[0]=1<=1 true
			{
				if(arr[i]!=fmin)//1!=1
			{
					smin=fmin;//smin=1
				
			}
				fmin=arr[i];//fmin=1
		}
		else
				if(fmin==smin || arr[i]<smin)
				{
					smin=arr[i]; 
				}
		}
		System.out.println("first min value="+fmin);
		System.out.println("Second min value="+smin);
		

	}
	

}
