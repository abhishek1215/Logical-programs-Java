package com.jsp.string;

public class CountFrequency 
{
	public static void check(int []n)
	{
		for(int i=0;i<n.length;i++)
		{
			int count=1;
			for(int j=i+1;j<=n.length-1;j++)
			{
				if(n[i]==-1)
				{
					break;
				}
				if(n[i]==n[j])
				{
					count++;
					n[j]=-1;
				}
			}
			if(n[i]!=-1)
			{
			System.out.println(n[i]+" ="+count);
			}
		}
	}

	public static void main(String[] args) 
	{
		int []a= {1,3,5,1,4,3,2,5,7,7};
		check(a);
	}

}
