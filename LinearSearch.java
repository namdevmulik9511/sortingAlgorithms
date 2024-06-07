package sortingAlgorithmn;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int a[]= {10, 20, 30, 40, 50};
		int target = 10;
		boolean result=search(a,target);
		if(result)
		{
			System.out.println("Element is found : "+result);
		}
		else
		{
			System.out.println("Element is not found : "+result);
		}
	}
	private static boolean search(int[] a, int target) 
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				return true;
			}
		}
		return false;
	}

}
