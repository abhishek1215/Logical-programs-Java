
public class Decimaltooctal
{
	public static void check(int n)
	{
		int m=n;
		int count=1;
		while(n>0)
		{
			count++;
			n=n/8;
		}
		int []a=new int[count];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=m%8;
			m=m/8;
			
		}
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
	}

	public static void main(String[] args)
	{
		
     check(520);
	}

}
