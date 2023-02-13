package Practice_JavaPrograms;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		int sum=0; 
		int t=n;
		while(n!=0)
		{
			int m=n%10;
			
			sum=sum+fact(m);
            n=n/10;
		}
		
		if(sum==t)
		{
			System.out.println("strong number");
		}else
		{
			System.out.println("not a strong number");
		}

	}
	public static int fact(int p)
	{int sum=1;
		for(int i=1;i<=p;i++)
		{
			 sum=sum*i;
			
		}return sum;
	}

}
