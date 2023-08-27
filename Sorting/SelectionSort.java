package Sorting;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr={9,7,6,3,8,2,1};
        System.out.println("Before Sorting...");
        for(int it:arr){
            System.out.print(it+" ");
        }

        System.out.println();
        selectionSort(arr);

        System.out.println("After Sorting...");
        for(int it:arr)
            System.out.print(it+" ");
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }

            if(i!=min_index)
                swap(arr,min_index,i);
        }
    }

    static void swap(int[] a,int l,int h){
        int temp=a[l];
        a[l]=a[h];
        a[h]=temp;
    }
}
