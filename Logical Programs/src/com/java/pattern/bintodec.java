package com.java.pattern;

public class bintodec
{
	public static int convert(int n)
	{
		int res=0;
		int p=0;
		while(n>0)
		{
			int r=n%10;
			res=res+(int)( Math.pow(2, p)*r);
			p++;
			n=n/10;
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) 
	{
		convert(10011);

	}

}
