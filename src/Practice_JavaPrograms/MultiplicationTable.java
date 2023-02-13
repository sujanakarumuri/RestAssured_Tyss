package Practice_JavaPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=num*i;
			System.out.println(num+"x"+i+"="+sum);
		}

	}

}
