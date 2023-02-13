package ArrayConcept;

import java.util.Scanner;

public class PrintNumbersWithOutLoop {
	
	static int printnum(int n)
	{
		if(n>0)
		{
			printnum(n-2);
			System.out.print(n+" ");
			
			
		}
		return n;
		
	}

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter number");
				int m=sc.nextInt();
		
			printnum(m);
		
	}

}
