package com.java.test;

import java.util.Scanner;

public class Circular 
{

	public static void check(int n)
	{
		int count=0;
		int count2=0;
		int num=n;
		while(n>0)
		{
			count++;
			n=n/10;
		}
	
		for(int i=1;i<=count;i++)
		{
			System.out.println(num);
			if(prime(num)==true)
			{
				count2++;
			}
			num=(int) ((num%((Math.pow(10,count-1)))*10)+(num/(Math.pow(10, count-1))));
			
		}
		if(count2==count)
		{
			System.out.println("circular prime");
		}
		else
		{
			System.out.println("not");
		}
	}
	static boolean prime(int num)
	{
		boolean b=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		check(n);

	}

}
