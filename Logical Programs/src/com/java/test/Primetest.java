package com.java.test;

public class Primetest 
{
	public static void check(int n)
	{
		boolean flag=false;
		for(int i=2;i<=n;i++)
		{
			if(prime1(i)&&prime1(n-i))
			{
				flag=true;
			}
			
		}
		if(flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
	public static boolean prime1(int i)
	{
	int	count=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		check(33);
		check(35);
		check(37);

	}

}
