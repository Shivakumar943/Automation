package java;

public class RevNumber {

	public static void main(String[] args) {

		int n=1234;
		int r=0;
		
		while(n>0)
		{
			int a=n%10;
			r=r*10+a;
			n=n/10;
		}
		System.out.println(r);
	} 

}
