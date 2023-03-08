
public class Duplicates
{
	public static void check(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==-1)
				{
					break;
				}
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
			if(a[i]!=-1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,1,2,4,1,5,1,2,6,7,6,7};
		check(a);
	}

}
