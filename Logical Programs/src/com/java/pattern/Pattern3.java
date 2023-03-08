package com.java.pattern;

public class Pattern3 
{
	public static void patt(int row,int column)
	{
		
		
		for(int i=1;i<=row;i++)
		{
			
			
			for (int j=1;j<=column;j++)
			{
				
				if(i==j)
				{
					System.out.print(j+" ");
					
				}
				else
				{
					System.out.print("*"+" ");
					
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
	     patt(4,4);

	}


}
