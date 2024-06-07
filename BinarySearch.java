package sortingAlgorithmn;
public class BinarySearch{
	public static void main(String[] args) 
	{
		int[] a= {2,3,4,5,6,9,24};
		int num=2;
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(num==a[mid])
			{
				System.out.println(a[mid]+" is found at index  :"+mid);
				break;
			}
			else if(num>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			if(start>end)
			{
				System.out.println("not found");
			}
		}	
	}
}
