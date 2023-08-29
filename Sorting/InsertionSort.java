package Sorting;

public class InsertionSort {

    public static void main(String[] args){
        int[] arr={7,5,3,1,9,15,27};
        insertionSort(arr,arr.length);
        for(int it:arr)
            System.out.print(it+" ");
        System.out.println();
    }

    public static void insertionSort(int[] a, int n){
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
}
