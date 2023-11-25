package zjava;

public class FivePattren {

	public static void main(String[] args) {

		int n=5;
		int k=0;
		for(int i=1;i<=n;i++)
		{
			k+=i;
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((k*2)-1+" ");
				k--;
			}
			System.out.println();
		}
	}
}