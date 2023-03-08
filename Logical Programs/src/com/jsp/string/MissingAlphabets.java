package com.jsp.string;

public class MissingAlphabets 
{
   
	public static String  check1(String s1)
	{
		String s2="abcdefghijklmnopqrstuvwxyz";
		char[]c2=s2.toCharArray();
		s1=s1.toLowerCase();
		char []c1=s1.toCharArray();
		c1=sort(c1);
		String res="";
		for(int i=0;i<c2.length;i++)
		{
			boolean b=false;
			for(int j=0;j<c1.length;j++)
			{
				if(c2[i]==c1[j])
				{
					b=true;
				}
			}
			if(b==false)
			{
				res=res+c2[i];
			}
		
		}
		return res;
	}
	public static  char[] sort(char[]c)
	{
		for(int i=0;i<c.length;i++)
		{
			boolean b=false;
			for(int j=0;j<c.length-1;j++)
			{
				if(c[j]>c[j+1])
				{
					b=true;
					char temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
			if(b==false)
			{
				break;
			}
		}
		return c;
	}
			

	public static void main(String[] args) 
	{
		System.out.println(check1("defghijklmnommpqrstuvwxyz"));

	}
}
