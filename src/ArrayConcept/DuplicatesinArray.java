package ArrayConcept;

import java.util.LinkedHashSet;

public class DuplicatesinArray {

	public static void main(String[] args) {
	    String[] str={"java","python","java","python","selenium","java"};
	    LinkedHashSet<String> set=new LinkedHashSet<String>();
	    for(int i=0;i<str.length;i++)
	    {
	    	set.add(str[i]);
	    }
	    
	    	System.out.println(set);
	    
	    

	}

}
