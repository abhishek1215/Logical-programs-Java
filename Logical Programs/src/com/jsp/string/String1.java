package com.jsp.string;

public class String1 
{
	public static int check(String s1,String t1)
	{
		int count=0;
		char[]c1=s1.toCharArray();
		char[]c2=t1.toCharArray();
		while(remove(c1,c2))
		{
			count++;
		}
		return count;
		
	}
	static boolean remove(char[]c1,char[]c2)
	{
		int res=0;
		for(int i=0;i<c2.length;i++)
		{
			int count=0;
			for(int j=0;j<c1.length;j++)
			{
				if(c2[i]==c1[j])
				{
					count++;
					c1[j]='0';
					break;
				}
			}
			if(count==1)
			{
				res++;
			}
		}
		if(res==c2.length)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		System.out.println(check("abacbc","bca"));
		System.out.println(check("abdadccacd","edac"));

	}

}
