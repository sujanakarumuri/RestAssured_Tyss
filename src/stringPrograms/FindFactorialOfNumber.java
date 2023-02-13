package stringPrograms;

import java.util.Scanner;

public class FindFactorialOfNumber {

	public static void main(String[] args) {
		for(;;) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for factorial is");
		int n=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		
		System.out.println("factorial of "+ n +" is "+fact);
		}
	}

}
