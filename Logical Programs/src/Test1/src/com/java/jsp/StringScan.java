package com.java.jsp;

import java.util.Scanner;

public class StringScan 
{
	public static String[] check(String []s1)
	{
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.print(s1[i]+" ");
		}
		return s1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String[]s1=new String[size];
		System.out.println("enter elements");
		for(int i=0;i<=s1.length-1;i++)
		{
			s1[i]=sc.next();
			
		}
		check(s1);

	}

}
