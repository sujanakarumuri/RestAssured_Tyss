package InterviewPrograms;

public class SubString {

	public static void main(String[] args) {
		String s="aabbaa";
		for(int i=0;i<s.length()-1;) {
		for(int j=i;j<i+2;j++)
		{
			System.out.print(s.charAt(j));			
			
		}
		System.out.println();
		i=i+1;
		}
		
		
		

	}

}
