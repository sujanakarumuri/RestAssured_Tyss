package ArrayConcept;

import java.util.Scanner;

public class RotationOfArray {

	public static void main(String[] args) {
		int a[]= {1,7,19,24,25,32,42};   //7,19,24,25,32,42,1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rotation number=");
		int p=sc.nextInt();
		for(int j=0;j<p;j++)
		{
		int temp[]=new int[a.length];
		int m=0;
		for(int i=0;i<a.length-1;i++)
		{
			
			temp[m]=a[i+1];
			m++;			
				
		}temp[temp.length-1]=a[0];
		for(int i=0;i<temp.length;i++)
		{
			a[i]=temp[i];
			System.out.print(temp[i]+" ");
			
		}System.out.println();
		}
		
		

//	}
//		
//		{
//			int a[]={1,2,3,4,5};
//			int temp[]=new int[a.length];
//			int temp2=a[0];
//			int m=0;
//			for(int i=1;i<a.length;i++)
//			{
//			temp[m]=a[i];
//			m++;
//			}
//			temp[temp.length-1]=temp2;
//			for(int i=0;i<temp.length;i++)
//			{a[i]=temp[i];
//			System.out.print(a[i]+" ");
//			}
//		}
	}
}
		
		
		
		
		
		
		
		
		
