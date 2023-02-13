package Practice_JavaPrograms;

public class A2B3C5 {

	public static void main(String[] args) {
		String s="a5b1c3";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				
				while(ch[i]>'0')
				{
					System.out.print(ch[i-1]);
					ch[i]--;
				}
				
					
			}
		}

	}

}
