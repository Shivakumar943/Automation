package zjava;

public class WelCometoColudTech {

	public static void main(String[] args) {

		String s="welcome to cloudtech";
		
		String[] sp=s.split(" ");
		
		System.out.println(s);
		
		for(int i=sp.length-1;i>=0;i--)
		{
			System.out.print(sp[i]+" ");
		}
	}
}