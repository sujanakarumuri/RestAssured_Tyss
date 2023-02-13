package ArrayConcept;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		String s="{[()]}";
		char[] ch=s.toCharArray();
		int m=0, n=ch.length-1;
		
		for(int i=0;i<ch.length;i++)
		{
			int j=ch[i];
			if(ch[m]==ch[n])
			{
				
				m++;
				n--;
			}
			//if(j==ch)
			
		}
		
	}
	
}
