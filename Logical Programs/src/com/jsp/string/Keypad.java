package com.jsp.string;

public class Keypad 
{
	public static int check(String s)
	{
		int res=0;
		char[]c1=s.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]>='a'&&c1[i]<='i')
			{
				res++;
			}
			else if(c1[i]>'i'&&c1[i]<='r')
			{
				res=res+2;
			}
			else
			{
				res=res+3;
			}
		}
		return res;
		
	}

	public static void main(String[] args)
	{
		System.out.println(check("aaaaaklmn"));

	}

}
