package com.java.pattern;

public class BintodecString 
{
	

	public static void convert(String s)
	{
		int res=0;
		int p=0;
		for(int i=s.length()-1;i>=0;i--)
		{
		   int r=s.charAt(i)-48;
		   res=res+(int)(Math.pow(2, p)*r);
		   p++;
		}
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		convert("10011");

	}

}
