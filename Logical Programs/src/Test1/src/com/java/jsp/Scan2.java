package com.java.jsp;

import java.util.Arrays;

public class Scan2 
{
	public static int[] check(int []num)
	{
		int []a=new int[num.length];
		int c=0;
		
		boolean b=true;
		for(int i=0;i<num.length;i++)
		{
			if(b==true&&num[i]%2==0)
			{
				a[c]=num[i];
				c++;
			}
			if(i==num.length-1&&b==true)
			{
				b=false;
				i=0;
			}
			if(b==false&&num[i]%2!=0)
			{
				a[c]=num[i];
				c++;
			
			}
		}
		System.out.println(Arrays.toString(a));
		
//		for(int j=0;j<=num.length-1;j++)
//		{
//			System.out.print(a[j]+" ");
//		}
		return a;
	}
	public static void main(String[] args) 
	{	
	    int[]num= {1,2,3,4,5,6,7,8,9,10};
		
		check(num);
		//sc.close();

	}
}
