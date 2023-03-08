import java.util.Arrays;

public class Bubblesort 
{
	public static int check(int []a)
	{
		a=sort(a);
		int count=0;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
			if(count==2)
			{
				return a[i];
			}
		}
		return -1;
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
		return a;
	}	

	public static void main(String[] args) 
	{
		int []a= {9,7,5,3,4,1,3,2,5,7};
		System.out.println(check(a));

	}

}
