     	package stringPrograms;

public class AddDoubleDigitIntegersInString {

	public static void main(String[] args) {
		String str="11b21c13";
		int sum=0;
		int tsum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				int n=str.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else {
				sum=sum+tsum;
			    tsum=0;
		}
		}
	sum=sum+tsum;
	System.out.println(sum);
	

}
}
