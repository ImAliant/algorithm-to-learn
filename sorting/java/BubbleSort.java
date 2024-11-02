public class BubbleSort {
	static void sort(int[] arr, int n) {
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

	static void swap(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
	}

	static void printArray(int[] arr, int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		int n = arr.length;
		sort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}

}
