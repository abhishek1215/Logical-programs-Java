package com.jsp.test;

public class Even 
{
	public static int[] check(int []a)
	{
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
		}
		int k=0;
		int []b=new int[count];
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[j]%2==0)
			{
				b[k]=a[j];
				k++;
			}
		}
		return b;
	}

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6,7,8,9,10,13,1423,524,1234};
		int[]c=check(a);
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
