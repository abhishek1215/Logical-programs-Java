package com.jsp.string;

public class TwoStrings 
{
	public static void check(String s)
	{
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				s1=s1+s.charAt(i);
					
			}

			if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				s2=s2+s.charAt(i);
					
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args)
	{
		check("AbCDehELLo");
	}

}
