package sortingAlgorithmn;
public class BinarySearchRecursive {
	public static void main(String[] args)
	{
        int[] a = {2, 3, 4, 5, 6, 9, 24};
        int num = 2;
        int result = binarySearch(a, 0, a.length - 1, num);
        if (result == -1) {
            System.out.println(num + " is not found in the array.");
        } else {
            System.out.println(num + " is found at index: " + result);
        }
    }
    private static int binarySearch(int[] arr, int start, int end, int num) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] > num) {
                return binarySearch(arr, start, mid - 1, num);
            }
            return binarySearch(arr, mid + 1, end, num);
        }
        return -1;
    }
}
