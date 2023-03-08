package com.java.test;

import java.util.Arrays;

public class Right 
{
	public static void check11(int[]a,int n)
	{
		for(int i=1;i<=n;i++)
		{
			int last=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				
				a[j]=a[j-1];
			
			}
			a[0]=last;
			
	 }
		for(int k=0;k<=a.length-1;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5};
		int n=5;
		check11(a,n);
		

	}

}
