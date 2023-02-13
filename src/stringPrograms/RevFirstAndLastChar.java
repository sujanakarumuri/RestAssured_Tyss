package stringPrograms;

public class RevFirstAndLastChar {

	public static void main(String[] args) {
		String s="Sujana";
		char[] temp=s.toCharArray();
		
		char a=temp[0];
		temp[0]=temp[temp.length-1];
		temp[temp.length-1]=a;

		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]);
		}
	}

}
