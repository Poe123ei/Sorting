public class bubbleSort {
    static int n;
    public static void main(String[] args){
        int [] a = {65, 90, 45, 80, 75};
        n = a.length;
        bubbleSort(a);
        System.out.print("Sorted array is: ");
        display(a);
        
    
} static void bubbleSort(int[] a){
    
    for(int i = 0 ; i < n-1; i++){
        boolean b = false;
        for(int j = n-2-i ;j >=0 ;j--){
            if(a[j] < a[j+1]){
                int tem = a[j];
                a[j] = a[j+1];
                a[j+1] = tem;
                b = true;
            }
        }
        System.out.print("After pass " + (i+1) + ": ");
        display(a);
        System.out.println();
        if(!b){
            break;
        }
    }
    
} static void display(int[] a){
   
    for(int i = 0; i < n; i++){
        System.out.print( a[i] + " ");
    }

}
}

