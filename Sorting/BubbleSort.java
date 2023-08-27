package Sorting;
//Time Complexity - O(N^2)
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 9, 6, 5, 1, 3, 2};

        bubbleSort(arr);

        for(int it:arr)
            System.out.print(it+" ");
        System.out.println();
    }
    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    swap(a,i,j);
                }
            }
        }
    }

    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
