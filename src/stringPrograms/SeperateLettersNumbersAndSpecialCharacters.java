package stringPrograms;

public class SeperateLettersNumbersAndSpecialCharacters {

	public static void main(String[] args) {
		String s="a$#A1sv%E2";
		String alpha=" ";
		String num=" ";
		String splchar=" ";
		String capitals=" ";
		for(int i=0;i<s.length();i++)
		{
			if( s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alpha=alpha+s.charAt(i);
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				capitals=capitals+s.charAt(i);
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}else
				splchar=splchar+s.charAt(i);
		}
		System.out.println(alpha+capitals+num+splchar);
	}

}
