package sortingAlgorithmn;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		int a[]= {6,4,5,2,7,1,3,8,9};
		bubbleSort(a);
		System.out.print("Bubble Sort: ");
		printsort(a);
	}
	private static void printsort(int[] a)
	{
		for(int print:a)
		{
			System.out.print(print+" ");
		}
	}
	private static void bubbleSort(int[] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}				
			}
		}
	}
}

