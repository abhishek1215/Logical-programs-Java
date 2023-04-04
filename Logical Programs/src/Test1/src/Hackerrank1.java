
public class Hackerrank1 
{
	public static int check(int []a)
	{
	    int count=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	int count2=0;
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    	  if(a[i]==-1)
	    	    {
	    		  break;
	    	    }
	    	  if(a[i]==a[j])
	    	  {
	    		  count2++;
	    		  a[j]=-1;
	    	  }
	    	}
	    	if(count2>0)
	    	{
	    		count++;
	    	}
	    }
	    return count;
	}

	public static void main(String[] args) 
	{
		int[] a= {1,8,5,8,5,1};
		System.out.println(check(a));
		int[] a1= {2,4,6,6,4,2,4};
		System.out.println(check(a1));
		

	}

}
