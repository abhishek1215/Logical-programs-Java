package com.jsp.string;

import java.util.Arrays;

public class Catdog 
{
	public static int[] check(int []n)
	{
		System.out.println(Arrays.toString(n));
		int []res=new int[n.length];
		System.out.println(Arrays.toString(res));
		int count=0;
		for(int i=0;i<res.length;i++)
		{
			if(n[i]%2==0)
			{
				res[count]=n[i];
				count++;
				
				
			}
		}
		System.out.println(Arrays.toString(res));
		for(int j=0;j<n.length;j++)
		{
			if(n[j]%2!=0)
			{
				res[count]=n[j];
				count++;
			}
		}
		System.out.println(Arrays.toString(res));
		return res;
		
	}
	
	


	public static void main(String[] args) 
	{
		int[]a= {5,3,1,6,4,7,2};
	   check(a);

	}

}
