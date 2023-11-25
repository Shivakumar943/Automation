package staticNonMethod;

public class Variable 
{
	int a=30;
	static int b=10;
	
	public static void disp(Variable v)
	{
		System.out.println(v.a);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		Variable v=new Variable();
		v.disp(v);
	}
}