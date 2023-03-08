package com.java.test;

public class Jumpnumber
{
	public static int check(int n)
	{
		int res=0;
		for(int i=n;i>9;i--)
		{
			boolean b=false;
			int m=i;
			int count=0;
			int a1=0;
			int a2=m%10;
			while(m>0)
			{
				int r=m%10;
				if(count==1)
				{
					a1=r;
				}
				
				if(count==1&&Math.abs(a1-a2)!=1)
				{
					b=false;
					break;
				}
				if(count==1&&Math.abs(a1-a2)==1)
				{
					b=true;
					a2=a1;
				}
				if(count==0)
				{
					count++;
				}
				m=m/10;
			}
			if(b==true)
			{
				res=i;
				break;
			}
			
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args)
	{
			check(123467);
	}

}
