package com.java.jsp;

import java.util.Scanner;

public class Nearten 
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
				if(r==2)
				{
					count=count+1;;
				}
				m=m/10;
			}
		}
		return count;
	
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n=");
		int n=sc.nextInt();
		System.out.println(check(n));
		
		


	}

}
