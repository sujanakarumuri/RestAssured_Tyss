package Practice_JavaPrograms;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int m=0;
		int p=n;
		int sum=1;
		while(n>0)
		{
			sum=n%10;//2
			m=m*10+sum;//12
			n=n/10;//1
			
		}
		//System.out.println(m);
		if(m==p)
		{
			System.out.println("palindrom number");
		}else
		{
			System.out.println("Not a palindrom number");
		}

	}

}
