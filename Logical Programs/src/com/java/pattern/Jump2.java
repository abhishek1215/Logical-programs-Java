package com.java.pattern;

public class Jump2 
{
	public static boolean check(int n)
	{
		boolean b=false;
		int a1=0;
		int a2=0;
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(count==1)
			{
				a1=rem;
			}
			if(count==1&&Math.abs(a1-a2)!=1)
			{
				b=false;
				return false;
			}
			if(count==1&&Math.abs(a1-a2)==1)
			{
				b=true;
				a2=a1;
				
				
			}
			if(count==0)
			{
				a2=rem;
				count++;
			}
			n=n/10;
			
		}
		return b;
	}

	public static void main(String[] args)
	{
		
    System.out.println( check(9898));
	}

}
