
public class Middlenum 
{
	public static int  check(int n,int add)
	{
		int count=0;
		int m=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		int div=count/2;
		int ten=(int)Math.pow(10, div);
		int res=(int)(((m/ten)+add)*ten+m%ten);
		return res;
	}

	public static void main(String[] args) 
	{
	   System.out.println(check(12345,1));

	}

}
