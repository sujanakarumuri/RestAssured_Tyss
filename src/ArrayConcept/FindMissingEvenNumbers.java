package ArrayConcept;

public class FindMissingEvenNumbers {

	public static void main(String[] args) {
		
		
		int a[]= {2,4,8,12,14,18,20};
		
		
//		for(int i=0;i<a.length-1;i++)
//		{  int count=1;
//			int n=a[i+1]-a[i];
//			while(n>1)
//			{
//				int val=a[i]+count;
//				if(val%2==0)
//				{
//					System.out.println(val);
//				}n--;
//				count++;
//			}
//			
//		}
//	}
//
//}



int temp[]=new int[20];
int m[]=new int[20];                            //   temp[i]=2 4 6 8 10
  for(int i=1;i<20;i++)                          //  a[i]=   2 4 8 10
  {
	  if(i%2==0)
	  {
		  temp[i]=i;
		  System.out.println(temp[i]);
	  }
  }
for(int i=0;i<20;i++) {	  
if(a[i]==temp[i])
{
	break;
}else
{
	System.out.println(temp[i]);
	//temp[i]=temp[i]+2;
	
}
}
  
  
 
	}
}
  