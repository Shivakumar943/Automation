package zjava;

public class StringNoCount {

	public static void main(String[] args) {

		String s="6s2hiv9akum1a3r";
		int ni=0;
		for(int i=0;i<s.length();i++)
		{
			Character c=s.charAt(i);
			
			if(Character.isDigit(c))
			{
				int a=Integer.parseInt(String.valueOf(c));
				ni=ni+a;
			}
		}
		System.out.println(ni);
	}
}