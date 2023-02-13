package ArrayConcept;

import java.util.LinkedHashSet;

public class Ass3Prog6PositionOfEachNumberWithOutDuplicates {

	public static void main(String[] args) {
		int[] a= {4,2,3,4,1,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer num: set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i])
				{
					count++;
				}
				
			}if(count==1)
				System.out.println("Unique numbers are=" +num);
		}

	}

}
