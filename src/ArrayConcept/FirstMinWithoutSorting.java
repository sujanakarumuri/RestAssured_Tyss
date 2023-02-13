package ArrayConcept;

public class FirstMinWithoutSorting {

	public static void main(String[] args) {
		int[] arr= {12,54,3,6,86,4};
		int fmin=arr[0];
		for(int i=0;i<arr.length;i++)
        {
			if(arr[i]<fmin)
			{
				fmin=arr[i];
				
				
			}
	
         }
		System.out.println("First min value "+fmin);
		System.out.println("second min value ");


	}


	}


