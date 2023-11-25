package zjava;

import java.util.HashSet;

public class RemoveDublictae {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,2,3};
		
		HashSet<Integer> hs=new HashSet<Integer> ();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(int h:hs)
		System.out.println(h);
	}
}