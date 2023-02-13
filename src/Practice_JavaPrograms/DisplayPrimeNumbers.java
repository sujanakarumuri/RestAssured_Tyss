package Practice_JavaPrograms;

import java.util.Scanner;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter n value=");
	   int num=sc.nextInt();
	   for(int i=1;i<=num;i++)
	   {
		   int j=2;
		   while(j<=num)
		   {
			   if(i%j==0)
			   {
				   break;
			   }else
			   {
				   j++;
			   }
		   }
		   if(j==i)
		   {
			   System.out.print(j+" ");
		   }
	   }
	}
	

}
