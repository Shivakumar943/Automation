package zjava;

import java.util.HashSet;

public class RemoveDubString {

	public static void main(String[] args) 
	{
		String s="abcdcd";
		System.out.println(dub(s));
	}
	public static String dub(String s)
	{
		HashSet<Character> hs=new HashSet<>();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			Character c=s.charAt(i);
			if(!hs.contains(c))
			{
				hs.add(c);
				sb.append(hs);
			}
		}
		return sb.toString(); 
	}
}