package com.jsp.string;

public class Numberofsmall 
{
	public static int check(String s1)
	{
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				System.out.println(s1.charAt(i));
			}
			
		}
		return c;
	}

	public static void main(String[] args) 
	{
		System.out.println(check("HeLLo abcDeeS"));

	}

}
