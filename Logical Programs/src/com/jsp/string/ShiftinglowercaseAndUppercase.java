package com.jsp.string;

import java.util.Arrays;

public class ShiftinglowercaseAndUppercase 
{
	static char[] shift(char[]c)
	{
		char[]res=new char[c.length];
		int k=0;
		int x=c.length-1;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>=97&&c[i]<=122)
			{
				res[k]=c[i];
				k++;
			}
			if(c[i]>=65&&c[i]<=90)
			{
				res[x]=c[i];
				x--;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
	}

	public static void main(String[] args) 
	{
		char[]c= {'a','B','c','D','E','e'};
		shift(c);

	}

}
