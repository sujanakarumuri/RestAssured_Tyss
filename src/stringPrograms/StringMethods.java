package stringPrograms;

public class StringMethods {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println(s.length());
		
		char[] s1=s.toCharArray();
		System.out.println(s1.length);
		
		System.out.println(s.charAt(0));
		
		System.out.println(s.indexOf('o'));
		
		String s2="Hi";
		String s3="Hello";
		String s4="Bye";
		System.out.println(s2.concat(s3).concat(s4));
		
		
		String joined=String.join(" ", s2,s3,s4);
		System.out.println(joined);
		
		System.out.println(s.contains("we"));
		
		System.out.println("Starts with we="+ s.startsWith("we"));
		
		System.out.println("Ends with me="+s.endsWith("me"));
		
		
		String s5=" How are you? ";
		System.out.println(s5.trim());
		
		System.out.println(s.substring(3, 7));
		
		String[] SPLIT = s5.split(" ");
		for(int i=0;i<SPLIT.length;i++)
		{
			System.out.println(SPLIT[i]);
		}
			
		String s6="welcome";
		System.out.println(s.equals(s6));
		
		System.out.println(s5.replace(" ", ""));
		
		System.out.println(s.toUpperCase());
		
		String ss="WELCOME TO CLASS";
		System.out.println(ss.toLowerCase());
		
		String s7="";
		System.out.println(s7.isBlank());
		
		for(char ch='A';ch<='Z';ch++)
		System.out.print(ch);
		
	}

}
