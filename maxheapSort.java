public class maxheapSort {
    static int n;
    public static void main(String[] args){
        int [] a = {65,90,100,80,75};
        n = a.length;
        maxheapSort(a);
        System.out.print("Sorted array is: ");
        display(a);
    }static void maxheapSort(int[] a){
        for(int i = n/2 -1; i >= 0; i--){
            heapify(a, n,i);


            
        }



    }void heapify(int [] a, int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i +2;
        if(left < n && a[left] > a[largest]){
            largest = left;

        }
        if(right <n && a[right] >a[largest]){
            largest = right;
        }
    }
}