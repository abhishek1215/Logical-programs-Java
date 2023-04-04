package com.java.jsp;

public class Geeks1 
{
	static int num(int a[], int n)
	    {
	        int mis=1;
	       for(int j=1;j<=n;j++)
	       {
	    	   boolean b=false;
	        for(int i=0;i<a.length;i++)
	        {
	        	 
	            if(a[i]==mis)
	            {
	                i=0;
	                mis++;
	                b=true;
	            }
	           
	        }
	        if(b==false)
	           {
	        	   break;
	           }
	       }
	        
	        
	        return mis;
	    }

	public static void main(String[] args) 
	{
		int []arr= {1,2,3,2,5,6};
		int s=6;
		System.out.println(num(arr,s));
		
		
		

	}

}
