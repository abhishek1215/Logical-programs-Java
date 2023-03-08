package com.jsp.string;

import java.util.Arrays;

public class Anagram2 
{
	public static boolean test(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static boolean check(String s)//single string anagram which contains all unique characters
	{
		
        s=s.toLowerCase();
        //without using sorting
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					return false;
//					
//				}
//			}
//			
//		}
//		return true;
        //Using sorting
		s=s.toLowerCase();
		System.out.println(s);
		char []c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i]==c[i+1])
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println(check("aDc18"));
		System.out.println(test("abdcdee","abecdee"));

	}

}
