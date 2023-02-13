package stringPrograms;

public class pratice {
	
	public static void main(String[] args)
	{  String a= "my name is sujana and attending classes in testyantra";
	 String[] s=a.split(" ");
	 int m=s.length-1;
	 String temp;
	 temp=s[0];
	 s[0]=s[m];
	 s[m]=temp;
	 for(int i=0;i<=m;i++)
	 {
		 System.out.println(s[i]);
	 }
	 
	 
	 
	
		
		
		
	}

}
