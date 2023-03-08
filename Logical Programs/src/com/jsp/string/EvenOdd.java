package com.jsp.string;

import java.util.Arrays;

public class EvenOdd 
{

	public static int[] check(int[]num)
	{
		num=sort(num);
		int[]res=new int[num.length];
		int x=0;
		int y=num.length-1;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				res[x]=num[i];
				x++;
			}
			else
			{
				res[y]=num[i];
				y--;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	public static int[] sort(int[]n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			for(int j=0;j<=n.length-1;j++)
			{
				if(j+1<=n.length-1 && n[j]> n[j+1])
				{
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
			
		}
//		System.out.println(Arrays.toString(n));
		return n;
	}
	public static void main(String[] args)
	{
		int[]num= {5,3,1,6,4,7,2};
		check(num);

	}

}
