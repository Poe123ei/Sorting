
public class insertionSort {
    static int n;

    public static void main(String[] args) {
        int[] a = {120, 70, 77, 45, 30, 20, 10};
        n = a.length;

        insertionSort(a);

        System.out.print("Sorted array is: ");
        display(a);
    }

    static void insertionSort(int[] a) {
        for (int i = 1; i < n; i++) {
            boolean b = false;

            for (int j = i; j > 0; j--) {
                if (a[j] > a[j - 1]) {
                    int tem = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tem;
                    b = true;
                } else {
                    break;
                }
            
            }
            System.out.print("After pass " + i + ": ");
            display(a);
            System.out.println();
            if (!b) {
                break;
            }
        }
    }

    static void display(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
