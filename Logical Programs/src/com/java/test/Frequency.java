package com.java.test;

import java.util.Scanner;

public class Frequency
{
	public static void check(int []a)
	{
		int count=0;
		for(int j=0;j<=a.length-1;j++)
		{
		int n=a[j];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		System.out.println(n+" "+count);
		count=0;
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<=a.length-1;i++ )
		{
			a[i]=sc.nextInt();
		}
	
		check(a);

	}

}
