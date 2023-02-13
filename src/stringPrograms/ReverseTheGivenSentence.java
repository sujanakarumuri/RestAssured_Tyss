package stringPrograms;

public class ReverseTheGivenSentence{

	public static void main(String[] args) {
		
      String str="I Love Banglore city";
      String[] s = str.split(" ");
      for(int i=s.length-1;i>=0;i--)
      {
    	  System.out.print(s[i]+" ");
      }
		
		
		
	}

}
