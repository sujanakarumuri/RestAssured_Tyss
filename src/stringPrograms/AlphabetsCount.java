package stringPrograms;

public class AlphabetsCount {

	public static void main(String[] args) {
		String s="aaabbcdddd";   //op=a3b2c1d4
		char[] c=s.toCharArray();
		
		for(int i=0;i<=c.length-1;)
		{
			int count=1;
			for(int j=1;j<=c.length-1;j++)
			{
				
				if(c[i]==c[j] && i!=j)
				{
				   count++;
				   
				}			
				
			}
			
			System.out.println(c[i]+" "+count);
			i=i+count;
		}
		

	}

}
