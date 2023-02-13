package ArrayConcept;

import java.util.Scanner;

public class Ass1Prog6 {

	public static void main(String[] args) {
		for(; ;)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value=");
		int n=sc.nextInt();
		
		
		if(n%5==0 && n%3==0)
		{
			System.out.println("HiHello");
		}else {
		if(n%5==0)
		{
			System.out.println("Hi");
	    }
		else if(n%3==0)
		{
			System.out.println("Hello");
		}
		
		else
			
			{
				System.out.println("Bye");
			}
	}
	}
	}
}



