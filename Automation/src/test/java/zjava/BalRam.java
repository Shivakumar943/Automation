package zjava;

public class BalRam 
{
	public static void main(String[] args) {

		String s="bala rama";
		String[] sp=s.split(" ");
		String op="";
		for(int i=0;i<sp.length;i++)
		{
			String wrd=sp[i];
			String ch="";
			for(int j=wrd.length()-1;j>=0;j--)
			{
				ch=ch+wrd.charAt(j);
			}
			op=op+ch+" ";
		}
		System.out.println(op);
	}
}