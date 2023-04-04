package com.java.jsp;

import java.util.Scanner;

public class Sharedigit
{
	public static boolean check1(int a,int b)
	{
		if(a%10==b%10||a%10==b/10||b%10==a/10||b/10==a/10)
		{
			return true;
		}
		return false;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the a1=");
		int a1=sc.nextInt();
		System.out.print("Enter b1=");
		int b1=sc.nextInt();
		
		System.out.println(check1(a1,b1));

	}

}
