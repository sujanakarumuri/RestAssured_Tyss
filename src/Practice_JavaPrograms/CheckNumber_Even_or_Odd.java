package Practice_JavaPrograms;

import java.util.Scanner;

public class CheckNumber_Even_or_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
	
			if(n%2==0)
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("odd number");
			}
		

	}

}
