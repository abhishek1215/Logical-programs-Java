import java.util.Arrays;

public class NumberofPairs
{
	public static int check(int []a)
	{
		a=sort(a);
		int c=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
				i++;
			}
		}
		return c;
	}
	public static int[] sort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			boolean b=false;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					b=true;
				}
			}
			if(b==false)
			{
				break;
			}
			
		}
		System.out.println(Arrays.toString(a));
		return a;
	}

	public static void main(String[] args)
	{
		int[]a= {8,6,4,3,3,2,3,4,5,1,3,4,6,78,9,1,7,5};
		System.out.println(check(a));
	}

}
