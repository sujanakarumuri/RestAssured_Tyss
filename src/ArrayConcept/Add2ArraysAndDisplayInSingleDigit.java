package ArrayConcept;

import java.util.Arrays;

public class Add2ArraysAndDisplayInSingleDigit {

	public static void main(String[] args) {
		int[] a= {4,2,10,3};
		int[] b= {1,2,3,4,5 };
		int length=0;
		if(a.length>=b.length)
		{
			length=a.length;
		}else
		{
			length=b.length;
		}
		int[] temp=new int[length];
		for(int i=0;i<length;i++)
		{
			try {
				temp[i]=a[i]+b[i];
			}catch(Exception e)
		{
				if(a.length>b.length)
				{
					temp[i]=a[i];
				}else
				{
					temp[i]=b[i];
				}
		}
		
		}
	String s="";
	for(int it:temp) {
		s=s+it;
	}
	System.out.println(" ");
	System.out.println(s);
	int[] res=new int[s.length()];
	for(int i=0;i<s.length();i++) {
		res[i]=s.charAt(i)-48;
	}
	System.out.println(Arrays.toString(res));

}
}
