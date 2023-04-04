package com.jsp.test;

import java.util.Scanner;
public class Program2 
{
	public static int check(int n)
	{
		int a1=0;
		int a2=1;
		int a3=0;
		int count =1;
		for(int i=1;i<=n-2;i++)
		{
			a3=a1+a2;
			count=count+a3;
			a1=a2;
			a2=a3;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number=");
		int n=sc.nextInt();
		System.out.println(check(n));
		sc.close();
	}

}

