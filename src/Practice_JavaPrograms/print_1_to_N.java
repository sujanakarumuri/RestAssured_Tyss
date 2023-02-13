package Practice_JavaPrograms;

import java.util.Scanner;

public class print_1_to_N {
	public static void main(String[] args)
	{ Scanner sc=new Scanner(System.in);
	  System.out.println("Enter n value=");
	  int n=sc.nextInt();
			  
		for(int i=0;i<n;i++)
		{
			System.out.print(i+" ");
		}
	}

}
