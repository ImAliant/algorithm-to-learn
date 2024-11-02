public class SelectionSort {
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minId = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minId]) {
                    minId = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minId];
            arr[minId] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.print("Original array: ");
        printArray(arr);

        sort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
