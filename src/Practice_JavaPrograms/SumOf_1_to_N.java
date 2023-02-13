package Practice_JavaPrograms;

import java.util.Scanner;

public class SumOf_1_to_N {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter n value=");
	   int n=sc.nextInt();
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		   sum=sum+i;
	   }
	   System.out.println(sum);

	}

}
