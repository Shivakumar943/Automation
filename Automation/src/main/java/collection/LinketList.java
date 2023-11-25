package collection;

import java.util.LinkedList;

public class LinketList {

	public static void main(String[] args) {

		LinkedList<String> ls=new LinkedList<String>();
		ls.add("shiva");
		ls.add("kumar");
		ls.add(null);
		ls.add("kumar");
		ls.add(null);
		
		System.out.println(ls.size());
		System.out.println(ls);
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println( ls.get(i)) ;
		}
	}
}