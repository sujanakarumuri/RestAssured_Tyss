package InterviewPrograms;

public class seperate0And1 {

	public static void main(String[] args) {
		int[] arr= {1,0,1,0,0,0,1};
		int temp[]=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
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
			System.out.println(temp[i]+" ");
		}
//		String s="sujana";
//		String rev="";
//		String[] str=s.split("");
//		int m=0;
//		int n=str.length-1;
//		rev=rev+str[n];
//		n--;
//		System.out.println(rev);
		
	}

}
