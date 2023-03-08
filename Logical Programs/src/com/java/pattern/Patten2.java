package com.java.pattern;

public class Patten2
{
	public static void patt(int row,int column)
	{
		
		
		for(int i=1;i<=row;i++)
		{
			
			char y='A';
			for (int j=1;j<=column;j++)
			{
				
				if(i%2!=0)
				{
					System.out.print(j+" ");
					
				}
				else
				{
					System.out.print(y+" ");
					y++;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
	     patt(4,6);

	}

}
