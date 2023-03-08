
public class Bintodec
{
	public static void check(int []a,int n)
	{
        a=sort(a);
        int count2=0;
        for(int i=a.length-1;i>=0;i--)
        {
        	 int count=0;
        	if(n/a[i]!=0)
        	{
        		count=count+n/a[i];
        		count2=count2+n/a[i];
        		System.out.println(a[i]+" ="+count);
        		n=n%a[i];
        	}
        	
        }
        System.out.println("total="+count2);
        
	}
	
	public static int[] sort(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			boolean b=false;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					b=true;
				}
			}
			if(b==false)
			{
				break;
			}
			
		}
		return a;
	}	

	public static void main(String[] args)
	{
		int []a= {1000,500,100,50,10};
		int n=4550;
		check(a,n);

	}

}
