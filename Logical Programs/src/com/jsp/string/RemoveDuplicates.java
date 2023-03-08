package com.jsp.string;

public class RemoveDuplicates
{
	public static void check(String s)
	{
		s=s.toLowerCase();
		char []c=convert(s);
		String res="";
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]=='0')
				{
					break;
				}
				
				if(c[i]==c[j])
				{
					c[j]='0';	
				}
			}
			if(c[i]!='0')
			{
				res=res+c[i];
			}
			
		}
		System.out.println(res);
	}
	public static char[] convert(String s)
	{
		char[]c=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		return c;
	}

	public static void main(String[] args)
	{
		check("aabxxxbsgffsdzzzzcsbnnmm");

	}

}
