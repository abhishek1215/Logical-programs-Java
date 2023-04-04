package com.java.jsp;

import java.util.Scanner;

public class Maxmod {
	public static int check(int a,int b)
	{
		if(a%5==b%5&&a>b)
		{
			return b;
		}
		else if(a%5==b%5&&a<b)
		{
			return a;
		}
		else if(a>b)
		{
			return a;
		}
		else if(b>a)
		{
			return b;
		}
		return 0;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the a=");
		int a=sc.nextInt();
		System.out.print("Enter b=");
		int b=sc.nextInt();
		
           System.out.println(check(a,b));
	}

}
