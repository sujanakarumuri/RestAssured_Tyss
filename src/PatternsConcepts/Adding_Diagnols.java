package PatternsConcepts;

public class Adding_Diagnols {

	public static void main(String[] args) {
		int n=3;
		int x=0;
		int[][] a= {{1,2,3},
		            {4,5,6},
		            {7,8,9}};
		for(int i=0;i<n;i++)
		{for(int j=0;j<n;j++)
		{
				if(i==j)
				{
					x=x+a[i][j];
				}
				}
				
		}	
		System.out.println(x);	

	}

}
