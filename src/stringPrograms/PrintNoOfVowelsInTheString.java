package stringPrograms;

public class PrintNoOfVowelsInTheString {

	public static void main(String[] args) {
    String str="india";
    int count=0;
    char[] ch = str.toCharArray();
   // String s1[]=str.charAt();
    for(int i=0;i<ch.length;i++)
    {
    	if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
    	{
    		count++;
    		System.out.println(ch[i]);
    	}
    }
    
    System.out.println(count);

	}

}
