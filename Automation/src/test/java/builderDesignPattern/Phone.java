package builderDesignPattern;

public class Phone 
{
	private String os;
	private int ram;
	private int battery;
	
	public Phone(String os, int ram, int battery) 
	{
		super();
		this.os = os;
		this.ram = ram;
		this.battery = battery;
	}

	@Override
	public String toString() 
	{
		return "Phone [os=" + os + ", ram=" + ram + ", battery=" + battery + "]";
	}
}