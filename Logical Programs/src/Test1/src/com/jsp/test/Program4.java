package com.jsp.test;

import java.util.Scanner;
public class Program4 
{
	public static void check(int n)
	{
		int sum=0;
		int pro=1;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			pro=pro*r;
			n=n/10;
			
		}
		if(sum==pro)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not Spy Number");
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

