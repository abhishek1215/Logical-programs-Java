package com.java.pattern;

public class Pattern1 
{
	public static void patt()
	{
		
		for(int i=1;i<=5;i++)
		{
			int x=i;
			int y=11-i;
			for(int j=1;j<=5;j++)
			{
				if(j%2!=0)
				{
					System.out.print(x+" ");
					x=x+10;
				}
				else
				{
					System.out.print(y+" ");
					y=y+10;
				}
				
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args)
	{
		patt();

	}

}
