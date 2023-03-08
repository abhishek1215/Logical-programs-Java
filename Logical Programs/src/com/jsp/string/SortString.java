package com.jsp.string;

import java.util.Arrays;

public class SortString 
{
	public static String sort(String s)
	{
		String res="";
		s=s.toLowerCase();
		char[]c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
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
		return res;
	}

	public static void main(String[] args) 
	{
		sort("ilkjhCSguuhgfdssaB");

	}

}
