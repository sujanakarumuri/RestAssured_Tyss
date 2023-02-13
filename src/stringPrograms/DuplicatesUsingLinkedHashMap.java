package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class DuplicatesUsingLinkedHashMap {

	public static void main(String[] args) {
		String s="sujanas";
		char[] ch=s.toCharArray();
		LinkedHashMap<Character, Integer> mapp=new LinkedHashMap<>();
		//HashMap<Character,Integer> mapp=new LinkedHashMap<>();
		for(Character c:ch)
		{
			if(mapp.containsKey(c)) {
				mapp.put(c, mapp.get(c)+1);
			}else
			{
				mapp.put(c, 1);
			}
		}
		for(Entry<Character,Integer> entry:mapp.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" === "+entry.getValue());
			}
		}

	}

}
