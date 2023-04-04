package com.jsp.test;

import java.util.Scanner;
public class Program3
{
	public static void check(int n)
	{
		int a1=1;
	    int b1=3;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a1+" ");
			a1=a1+b1;
			b1++;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number=");
		int n=sc.nextInt();
		check(n);

	}

}

