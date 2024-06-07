package sortingAlgorithmn;

public class LinearSearchUsingRecurstion 
{
	public static void main(String[] args)
	{
		int a[]= {10, 20, 30, 40, 50};
		int target = 10;
		int i=0;
		boolean result=search(a,target,i);
		if(result)
		{
			System.out.println("Element is found : "+result);
		}
		else
		{
			System.out.println("Element is not found : "+result);
		}
	}
	private static boolean search(int[] a, int target, int i) 
	{
		if(i<a.length)
		{
			if(a[i]==target)
			{
				return true;
			}
			return search(a, target, ++i);
		}
		return false;
	}
}
