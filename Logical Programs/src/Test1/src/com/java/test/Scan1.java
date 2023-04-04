package com.java.test;

import java.util.Scanner;

public class Scan1 
{
   public static int[] check(int []num)
   {
	   int []a=new int[num.length];
	   
	   int c=0;
	   boolean b=false;
	   for(int i=0;i<=num.length-1;i++)
	   {
		   if( b==false&&num[i]%2==0)
		   {
			   a[c]=num[i];
			   System.out.print(a[c]+" ");
			   c++;
		   }
		    if(i==num.length-1&&b==false)
		   {
			   i=0;
			   b=true;
			   
		   }
		    if(b==true&&num[i]%2!=0)
		      {
		    	  a[c]=num[i];
		    	  System.out.print(a[c]+" ");
		    	  c++;
		      }
	   }
	   return a;
	  
   }
   public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size");
//		int size=sc.nextInt();
	    int[]num= {1,2,3,4,5,6,7,8,9,10};
		//System.out.println("enter elements");
//		for(int i=0;i<=num.length-1;i++)
//		{
//			num[i]=sc.nextInt();
//			
//		}
//		System.out.println(check(num));
		check(num);
		//sc.close();

	}
}

