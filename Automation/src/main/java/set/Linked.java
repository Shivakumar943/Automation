package set;

import java.util.LinkedHashSet;

public class Linked {
	public static void main(String[] args) {

		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		lh.add("shiva");
		lh.add("kumar");
		lh.add(null);
		lh.add(null);
		lh.add("kumar");
		
		System.out.println(lh);		//OutPut : [shiva, kumar, null] No dublicate and only 1 null
	}

}
