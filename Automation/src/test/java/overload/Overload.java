package overload;

public class Overload 
{
	public void methos(int a,String b)
	{
		System.out.println(a+""+b);
	}
	
	public void methos(int a,String b,int c)
	{
		System.out.println(a+""+b+""+c);
	}

	public static void main(String[] args) 
	{
		Overload o=new Overload();
		o.methos(0, null, 0);
	}
}