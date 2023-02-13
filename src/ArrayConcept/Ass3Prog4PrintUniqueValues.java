package ArrayConcept;

import java.util.LinkedHashSet;

public class Ass3Prog4PrintUniqueValues {

	public static void main(String[] args) {
		int[] a= {4,3,2,3,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer num:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++) {
			if(num==a[i])
			{
				count++;
			}
			
		}if(count==1)
			System.out.println("Unique values are= "+ num );

	}}
		

}
