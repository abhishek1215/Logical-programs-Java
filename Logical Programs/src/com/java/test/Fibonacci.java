package com.java.test;
import java.util.Scanner;
public class Fibonacci
{
	public static int print(int n)
	{
		int a=0;
		int b=1;
		if(n==1)
		{
			return a;
		}
		if(n==2)
		{
			return 1;
		}
		int count=1;
		int c=0;
		for(int i=1;i<=n-2;i++)
		{
			c=a+b;
			count=count+c;
			a=b;
			b=c;
		}
		return count;
	}
	public static void nth(int n)
	{
		int a=0;
		int b=1;
		int count=2;
		if(n==1)
		{
			System.out.println(a);
		}
		if(n==2)
		{
			System.out.println(b);
		}
		int c=0;
		for(int i=1;i<=10000;i++)
		{
			c=a+b;
//			System.out.print(c+" ");
			count++;
			if(count==n)
			{
				System.out.println(c);
				break;
			}
			a=b;
			b=c;
		}
	}
	public static void print1(int n)
	{
		int a=0;
		int b=1;
		int c=1;
		System.out.print(a+" "+b+" "+c+" ");
		int d=0;
		int count=3;
		for(int i=1;i<=100000;i++)
		{
			d=a+b+c;
//			System.out.print(d+" ");
			count++;
			if(count==n)
			{
				System.out.println(d);
			}
			a=b;
			b=c;
			c=d;
		}
//		System.out.println(b);
//		System.out.println(a);
//		System.out.println(a+b);
		
	}

	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	   print1(n);
	   sc.close();
	    
	    		

	}

}
