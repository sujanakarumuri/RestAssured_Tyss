package stringPrograms;

public class FindMaxLengthInStringArray {

	public static void main(String[] args) {
		//String[] s= {"abcdef","avbc","qfq","zxcvcx","ab","ewree"};
		String[] s= {"12345678", "123", "234567890","12"};
		String maxlength=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()>maxlength.length())
			{
				maxlength=s[i];
			}
			
		}
		System.out.println(maxlength);
		
	//same length 2 values are there go for loop
//		for(int i=0;i<s.length;i++)
//		{
//			if(s[i].length()==maxlength.length())
//			{
//				
//				System.out.println(s[i]);
//				}
//        }

	}

}
