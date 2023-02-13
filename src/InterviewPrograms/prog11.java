package InterviewPrograms;

public class prog11 {

	public static void main(String[] args) {
		String s="aaabbcdddf";  //o/p=a3b2c1d3f1
		char[] str=s.toCharArray();
		for(int i=0;i<str.length-1;) {
			int count=1;
			for(int j=i+1;j<str.length-1;j++)
		{ 
			
			if(str[i]==str[j])
			{
				
				count++;
				
				
			}

		}
			System.out.print(str[i]+""+count+" ");
			i=i+count;
			
			
		
			
		}
		System.out.print(str[str.length-1]);
		
		

	}

}
