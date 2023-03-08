package com.jsp.string;

import java.util.Arrays;

public class Panagram 
{
	public static boolean  check(String s1)
	{
		if(s1.length()!=26)
		{
			return false; 
		}
		String s2="abcdefghijklmnopqrstuvwxyz";
		char[]c2=s2.toCharArray();
		s1=s1.toLowerCase();
		char []c1=s1.toCharArray();
		c1=sort(c1);
		int count=0;
		for(int i=0;i<c1.length;i++)
		{
			count++;
			if(c1[i]!=c2[i])
			{
				System.out.println(count);
				return false;
			}
		
		}
		System.out.println(count);
		return true;
	}

	public static  char[] sort(char[]c)
	{
		for(int i=0;i<c.length;i++)
		{
			boolean b=false;
			for(int j=0;j<c.length-1;j++)
			{
				if(c[j]>c[j+1])
				{
					b=true;
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
			if(b==false)
			{
				break;
			}
		}
		return c;
	}
			

	public static void main(String[] args) 
	{
		System.out.println(check("jbcdefghiaklmnopqrwtuvszyx"));
		System.out.println(check("jbcdefghiablmnorqrwtuvszyx"));

	}

}
