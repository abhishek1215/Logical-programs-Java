package com.jsp.test;
import java.util.Scanner;
public class Numberprogram1 
{
	public static int check(int n)
	{
		int a1=0;
		int a2=1;
		int a3=0;
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 1;
		}
		for(int i=3;i<=n;i++)
		{
			a3=a1+a2;
			a1=a2;
			a2=a3;
		}
		int count=0;
		while(a3>0)
		{
			count++;
			a3=a3/10;
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
