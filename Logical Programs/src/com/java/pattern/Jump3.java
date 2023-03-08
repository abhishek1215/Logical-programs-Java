package com.java.pattern;

public class Jump3 
{
	public static void print(int m)
	{
		for(int i=100;i<=m;i++)
		{
			boolean b=false;
			int n=i;
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
					break;
				
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
			if(b==true)
			{
				System.out.print(i+" ");
		   }

		}
	}

	public static void main(String[] args) 
	{
		print(1000);

	}

}
