package Practice_JavaPrograms;

import java.util.Scanner;

public class GivenNumberIsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int n=sc.nextInt();
		int j=2;
		while(j<=n)
		{
			if(n%j==0)
			{
				break;
			}else
			{
				j++;
			}
		}if(j==n)
		{
			System.out.println("prime number");
		}else
		{
			System.out.println("not a prime");
		}
			

	}

}
