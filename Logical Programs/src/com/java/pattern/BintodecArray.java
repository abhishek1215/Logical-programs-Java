package com.java.pattern;

public class BintodecArray 
{
	public static int convert(int[] n)
	{
		int res=0;
		int p=0;
		for(int i=n.length-1;i>=0;i--)
		{
			res=res+(int) (Math.pow(2,p)*n[i]);
			p++;
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) 
	{
		int []n= {1,0,0,1,1};
		convert(n);
    
	}

}
