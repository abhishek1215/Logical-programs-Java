package com.jsp.string;

public class TwoCars
{
	public static String add(String s,int n,char a)
	{
		System.out.println(s.substring(0,n));
		System.out.println(s.substring(n,s.length()));
		return s.substring(0,n)+a+s.substring(n,s.length());
		
	}
	public static String replace(String s,int n,char c)
	{
		return s.substring(0,n)+c+s.substring(n+1,s.length());
		
	}
	public static void main(String[] args)
	{
		System.out.println(add("acdef",3,'b'));
		System.out.println(replace("abcwe",3,'d'));
	}

}
