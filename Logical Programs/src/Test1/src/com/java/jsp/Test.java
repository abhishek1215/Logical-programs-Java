package com.java.jsp;

public class Test 
{
	public String toString()
	{
		return "xyz";
	}
	
     public static void main(String[] args) 
     {
		Test t1=new Test();
		Test t2=new Test();
		String s1="ABC";
		String s2="ABC";
		System.out.println(s1.hashCode());
	    System.out.println(s1.toString());
		System.out.println(s1.equals(s2));
	}
}
