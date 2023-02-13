package stringPrograms;

public class AddIntegersInAGivenString {

	public static void main(String[] args) {
		String s="b2c3d14";
	    int sum=0;
		for(int i=0;i<s.length();i++)// s.length()=6
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{ int n=s.charAt(i)-48;
			  sum=sum+n;
			}
		}
		System.out.println(sum);
		
		
//		char[] ch=s.toCharArray();
//		String str="";
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>='0' && ch[i]<='9')
//			{
//				str=str+ch[i];
//			}
//		}
//		System.out.println(str);
//			int num=Integer.parseInt(str);
//			int sum=0;
//			while(num>0)
//			{
//				int r=num%10;
//				sum=sum+r;
//				num=num/10;
//			}
//		
//		System.out.println(sum);
//
//		
	}

}
