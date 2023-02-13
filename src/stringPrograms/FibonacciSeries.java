package stringPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fb1=0;
		int fb2=1;
		int fb3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		System.out.print(fb1+" ");
		System.out.print(fb2+" ");          
		for(int i=0;i<n;i++)
		{
			 fb3=fb1+fb2;
			fb1=fb2;
			fb2=fb3;
		
		
		System.out.print(fb3+" ");
		
		
		}
	}

}
