package com.jsp.string;

import java.util.Arrays;

public class Anagram2Strings 
{
	public static boolean check(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
       char[]c1=convertAndsort(s1);
        char[]c2=convertAndsort(s2);
        for(int i=0;i<c1.length;i++)
        {
        	if(c1[i]!=c2[i])
        	{
        		return false;
        	}
        }
        return true;
	}
	public static char[] convertAndsort(String s)
	{
		char[]c=new char[s.length()];
		for(int k=0;k<s.length();k++)
		{
			c[k]=s.charAt(k);
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{	
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		return c;
	}

	public static void main(String[] args) 
	{
	   	System.out.println(check("Abppocg","gboppca"));

	}

}
