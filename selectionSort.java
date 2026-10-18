public class selectionSort{
    static int n;
    public static void main(String[] args){
        int [] a = {65,90,100,80,75};
        n = a.length;
        selectionSort(a);
        System.out.print("Sorted array is: ");
        display(a);

    

}static void selectionSort(int[] a){
    for(int i = 0; i < n-1; i++){
        int  max = i;
        for(int j = i+1; j < n; j++){
            if(a[j] > a[max]){
                max = j;
            }
        }
        int tem = a[max];
        a[max] = a[i];
        a[i] = tem;

        System.out.print("After pass " + (i+1) + ": ");
        display(a);
        System.out.println();
    }
}static void display(int [] a){
    for(int i = 0; i < n; i++){
        System.out.print(a[i] + " ");
    }
}
}