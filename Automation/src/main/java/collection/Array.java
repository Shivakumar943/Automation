package collection;

import java.util.ArrayList;

public class Array 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("shiva");
		a.add("kumar");
		a.add("shiva");		//dublicate can be accepted 
		a.add(null);		
		a.add(null);		//multiple null can be accepted 
		
		
//		for(int i=0;i<a.size();i++)
//		{
//			System.out.println(a.get(i));
//		}

		
		for(String ab:a)
		{
			System.out.println(ab);
		}
	}
}