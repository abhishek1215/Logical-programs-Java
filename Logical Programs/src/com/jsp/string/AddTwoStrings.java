package com.jsp.string;

public class AddTwoStrings
{
	public static void check(String s1,String s2)
	{
		int n1=convert(s1);
		int n2=convert(s2);
		System.out.println(n1*n2);
		
	}
	public static int convert(String s)
	{
		
		int res=0;
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
			int n=s.charAt(i)-48;
			res=res*10+n;
			}
			else
			{
				count++;
			}
			
		}
		
		if(count==1)
		{
			return -res;
		}
		
		return res;
	}

	public static void main(String[] args) 
	{
		check("-123","-2");
		check("78","-10");

	}

}
