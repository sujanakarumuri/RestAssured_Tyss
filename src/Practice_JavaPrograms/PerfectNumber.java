package Practice_JavaPrograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number to check perfect number");
		int n=sc.nextInt();
		int m=n/2;
		int count=0;
		for(int i=1;i<=m;i++)
		{
			if(n%i==0)
			{
				count=count+i;
			}
			
		}
		if(count==n)
		{
			System.out.println("perfect number ");
		}else
		{
			System.out.println("Not a perfect number");
		}
				

	}

}
