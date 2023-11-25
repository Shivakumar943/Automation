package zjava;

public class SecondMax {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,2,3};
		int max=0;
		int sm=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=sm;
				max=a[i];
			}else
				if(a[i]>sm)
				{
					sm=a[i];
				}
		}
		System.out.println(sm);
		System.out.println(max);
	}

}
