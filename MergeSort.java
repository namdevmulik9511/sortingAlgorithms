package sortingAlgorithmn;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 }; 
		int beg=0;
		int end=a.length-1;
		mergeSort(a,beg,end);
		System.out.print("Merge Sort : ");
		print(a);
	} 
	private static void print(int[] a) 
	{
		for(int pr:a)
		System.out.print(pr+" ");
	}
	public  static void mergeSort(int a[], int beg, int end)  
	{  
		if (beg < end)   
		{  
			int mid = (beg + end) / 2;  
			mergeSort(a, beg, mid);  
			mergeSort(a, mid + 1, end);  
			merge(a, beg, mid, end);  
		}  
	}
	public static void merge(int a[], int beg, int mid, int end)    
	{    
		int i, j, k;  
		int n1 = mid - beg + 1;    
		int n2 = end - mid;    

		int LeftArray[] = new int[n1];  
		int RightArray[] = new int[n2];  

		for (i = 0; i < n1; i++)    
			LeftArray[i] = a[beg + i];    
		for (j = 0; j < n2; j++)    
			RightArray[j] = a[mid + 1 + j];    

		i = 0; 
		j = 0; 
		k = beg;   
		while (i < n1 && j < n2)    
		{    
			if(LeftArray[i] <= RightArray[j])    
			{    
				a[k] = LeftArray[i];    
				i++;    
			}    
			else    
			{    
				a[k] = RightArray[j];    
				j++;    
			}    
			k++;    
		}    
		while (i<n1)    
		{    
			a[k] = LeftArray[i];    
			i++;    
			k++;    
		}    
		while (j<n2)    
		{    
			a[k] = RightArray[j];    
			j++;    
			k++;    
		}    
	}
}

