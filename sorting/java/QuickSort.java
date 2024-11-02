public class QuickSort {
	static int partition(int[] arr, int n, int m) {
		// On choisit le pivot
		int pivot = arr[m];
		// On initialise l'indice de l'élément le plus petit
		int i = n - 1;

		// On parcourt le tableau
		for (int j = n; j <= m - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, i + 1, m);
		return i + 1;
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void sort(int[] arr, int n, int m) {
		if (n < m) {
			int p = partition(arr, n, m);
			sort(arr, n, p - 1);
			sort(arr, p + 1, m);
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};
		sort(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
