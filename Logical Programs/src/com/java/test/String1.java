package com.java.test;

public class String1 
{
	public static String check(String str)
	{
		return str.charAt(str.length()-2)+""+str.charAt(str.length()-1)+
		str.charAt(str.length()-2)+""+str.charAt(str.length()-1)+
		str.charAt(str.length()-2)+""+str.charAt(str.length()-1);
	}
	public static void main(String[] args) 
	{
		System.out.println(check("red"));
	}

}
