
public class quickSort {
    static int n;

    public static void main(String[] args) {
        int[] a = {12,56,21,34,78,90,45,67,89,23};
        n = a.length;

        quickSort(a, 0, n - 1);

        System.out.print("Sorted array is: ");
        display(a);
    }

    static void quickSort(int[] A, int l, int r) {
        if (l < r) {
            int pivot = partition(A, l, r);

            quickSort(A, l, pivot - 1);
            quickSort(A, pivot + 1, r);
        }
    }

    static int partition(int[] A, int l, int r) {
        int pivot = A[r];
        int i = l - 1;

        for (int j = l; j <= r - 1; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }

        swap(A, i + 1, r);
        return i + 1;
    }

    static void swap(int[] A, int first, int second) {
        int temp = A[first];
        A[first] = A[second];
        A[second] = temp;
    }

    static void display(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
