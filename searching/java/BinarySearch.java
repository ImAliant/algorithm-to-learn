public class BinarySearch {
    static int searchIte(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) 
                return mid;

            if (arr[mid] < x) 
                l = mid + 1;
            else 
                r = mid - 1;
        }
        return -1;
    }

    static int searchRec(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) return mid;

            if (arr[mid] > x) 
                return searchRec(arr, l, mid - 1, x);
            return searchRec(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = searchRec(arr, 0, n-1, x);/* searchIte(arr, x); */
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }
}
