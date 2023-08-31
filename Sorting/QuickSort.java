package Sorting;

public class QuickSort {
    public static void main(String[] args){
        int[] arr={5,3};
        System.out.print("Before Sorting...");
        for(int it:arr){
            System.out.print(it+" ");
        }
        System.out.println();
        int h=arr.length-1;

        quickSort(arr,0,h);

        System.out.print("After Sorting...");
        for(int it:arr){
            System.out.print(it+" ");
        }
        System.out.println();
    }

    public static void quickSort(int[] a,int l,int h){
        if(l<h){

            int pivot=partition(a,l,h);

            quickSort(a,l,pivot-1);
            quickSort(a,pivot+1,h);
        }
    }
    static int partition(int[] a,int l,int h){
         int i=l;
         int j=h;
         int pivot=a[l];
         while(j>i){
             while(i<=h && a[i]<=pivot)i++;
             while(j>=l && a[j]>pivot)j--;
             if(j>i)
                 swap(a,j,i);
         }
         swap(a,j,l);
         return j;
    }

    static void swap(int[] a,int l,int h){
        int temp=a[l];
        a[l]=a[h];
        a[h]=temp;
    }
}
