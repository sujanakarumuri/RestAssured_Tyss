package ArrayConcept;

public class Seperate0And1 {

	public static void main(String[] args) {
		
		int[] arr= {0,1,1,1,0,0,1};
		int[] temp=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				temp[m]=arr[i];
				m++;
			}
			else if(arr[i]==1)
				 {
					temp[n]=arr[i];
					n--;
				}
		}
		for(int i=0;i<temp.length;i++)
		{
		 System.out.print(temp[i]+" ");
		}

	}

}
