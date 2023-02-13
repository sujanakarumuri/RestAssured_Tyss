package ArrayConcept;

import java.util.LinkedHashSet;

public class Ass3Prog1PrintUniqueNumbersUsingHashSet {

	public static void main(String[] args) {
		int[] a= {4,3,2,3,1,1,4,3};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		int count=0;
		for(Integer num:set) {
			
			//System.out.println(num);
			for(int i=0;i<a.length;i++) {
			if(num==a[i])
			{
				count++;
				
			}
			}
			
				if(count>1) {
					System.out.println(num+ "=="+ count);
				}
			
		
		}

	}

}
