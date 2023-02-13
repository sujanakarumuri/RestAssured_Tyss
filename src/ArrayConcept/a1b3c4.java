package ArrayConcept;

public class a1b3c4 {

	public static void main(String[] args) {
		String str="a1b3c4";
		int sum=0;
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)>='0' && str.charAt(i)<='9')
	    	{
	    		sum=sum+str.charAt(i);
	    	}
	    }
	    System.out.println(sum);
		
		

	}



}
