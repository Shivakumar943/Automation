package zjava;

import java.util.HashSet;

public class MaxCharDisplay {

	public static void main(String[] args) {

		String s="abccc";
		int count=1;
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			Character c=s.charAt(i);
			
			if(!hs.contains(c))
			{
				hs.add(c);
			}else
			{
				count++;
				
			}System.out.println(c+" : "+count);
		}
	}
}