package Practice_JavaPrograms;

import java.util.Scanner;

public class Multiplication_Tables {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=10;j++)
			{
				sum=i*j;
				System.out.println(i+"x"+j+"="+sum);
			}
			System.out.println();
			
		}

	}

}
