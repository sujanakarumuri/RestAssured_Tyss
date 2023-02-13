package Practice_JavaPrograms;

import java.util.Scanner;

public class Print_N_to_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value=");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			System.out.print(i+" ");
		}

	}

}
