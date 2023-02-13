package Practice_JavaPrograms;

public class Interview_Program2 {

	public static void main(String[] args) {
		String s="My name is sujana";
		String[] str=s.split(" ");
		String rev="";
		for(int i=str.length-1;i>=0;i--)
		{
			rev=rev+str[i];
		}
          //System.out.println(rev);
		int j=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				System.out.println(rev.charAt(j));
				j++;
			}else
			{
				System.out.println(" ");
			}
		}
		

	}

}
