package multipleInheritance;

interface A
{
	public void dis();
}
interface B
{
	public void dis();
}
public class Inheritance implements A , B
{
	public void dis()
	{
		System.out.println("I am Multiple inheritance");
	}
	public static void main(String[] args) {
		Inheritance in=new Inheritance();
		in.dis();
	}
}