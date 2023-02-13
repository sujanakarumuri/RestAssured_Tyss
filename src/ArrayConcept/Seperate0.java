package ArrayConcept;

public class Seperate0 {

	public static void main(String[] args) { 
			
			int[] arr= {0,2,3,4,0,1,0};
			int[] temp=new int[arr.length];
			int m=0;
			int n=arr.length-1;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					temp[m]=arr[i];
					m++;
				}
				else
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
