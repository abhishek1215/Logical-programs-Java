package com.jsp.test;

import java.util.Scanner;
public class Program5 
{
	public static int check(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			int m=i;
			while(m>0)
			{
				int r=m%10;
				if(r==3)
				{
					count++;
				}
				m=m/10;
			}
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

