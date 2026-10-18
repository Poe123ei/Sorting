
import java.util.*;

public class radixSort {
    static int n;

    public static void main(String[] args) {
        int[] a = {65, 90, 100, 80, 75};
        n = a.length;

        radixSort(a);

        System.out.print("Sorted array is: ");
        display(a);
        System.out.println();
    }

    static void radixSort(int[] a) {
        int max = getMax(a);

        int pass = 1;
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(a, exp);

            System.out.print("After pass " + pass + ": ");
            display(a);
            System.out.println();

            pass++;
        }
    }

    private static int getMax(int[] a) {
        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    static void countSort(int[] a, int exp) {
        List<Integer>[] bucket = new ArrayList[10];

        for (int i = 0; i < 10; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (int num : a) {
            int digit = (num / exp) % 10;
            bucket[digit].add(num);
        }

        int index = 0;

        for (int i = 0; i < 10; i++) {
            for (int num : bucket[i]) {
                a[index++] = num;
            }
        }
    }

    static void display(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
