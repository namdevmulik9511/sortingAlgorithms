package sortingAlgorithmn;

public class QuickSort
{
	public static void main(String[] args)
	{
		int[] arr = {7,9,4,8,3,6,2,5};
		quickSort(arr,0,arr.length-1);
		System.out.print("QuickSort : ");
		display(arr);
	}
	private static void display(int[] arr)
	{
		for(int print:arr)
		{
			System.out.print(print+" ");
		}	
	}
	private static void quickSort(int[] arr, int i, int j) 
	{
		if (i < j) {
			int pi = partition(arr, i, j);
			quickSort(arr, i, pi - 1);
			quickSort(arr, pi + 1, j);
		}
	}
	static int partition(int[] arr, int i, int j) {
		int pivot = arr[j];  
		int k = (i - 1); 

		for (int l = i; l <= j - 1; l++) {
			if (arr[l] < pivot) {
				k++;
				int temp = arr[k];
				arr[k] = arr[l];
				arr[l] = temp;
			}
		}
		// Swap arr[i + 1] and arr[] (or pivot)
		int temp = arr[k + 1];
		arr[k + 1] = arr[j];
		arr[j] = temp;
		return (k + 1);
	}
}
