package com.java.jsp;

import java.util.Scanner;

public class Arraychar 
{
	public static String[] test(String []num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.print(num[i]+" ");
		}
		return num;
	}

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size");
//		int size=sc.nextInt();
//		char[]num=new char[size];
//		System.out.println("enter the chars");
//		for(int i=0;i<=num.length-1;i++)
//		{
//			num[i]=sc.next().charAt(0);
//		}
//		test(num);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String[]num=new String[size];
		System.out.println("enter the chars");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.next();
		}
		test(num);

	}

}
