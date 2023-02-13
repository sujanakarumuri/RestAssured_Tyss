package Practice_JavaPrograms;

import java.util.Scanner;

public class PerfectNumberInGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int n=sc.nextInt();
		int m=n/2;
		
		for(int j=1;j<=n;j++) {
			int count=0;
		for(int i=2;i<=m;i++)
		{
			if(j%i==0)
			{
				count=count+i;
			}
			
		}
		if(count==j)
		{
			System.out.println(j+" perfect number");
		}

		}
	}

}
