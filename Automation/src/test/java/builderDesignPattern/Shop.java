package builderDesignPattern;

public class Shop 
{
	public static void main(String[] args) 
	{
//		Phone p=new Phone("Android",2,5000);
//		System.out.println(p);
		
		
		Phone p=new PhoneBuilder().setRam(3).getPhone();
		System.out.println(p);
	}
}