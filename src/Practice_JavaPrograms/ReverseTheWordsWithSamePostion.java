package Practice_JavaPrograms;

public class ReverseTheWordsWithSamePostion {

	public static void main(String[] args) {
		String s="Welcome To India";
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String s2=str[i];
			for(int j=s2.length()-1;j>=0;j--)
			{
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
		

	}

}
