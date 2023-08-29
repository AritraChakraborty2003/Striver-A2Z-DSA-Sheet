package Sorting;

import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args){
        int[] arr={9,8,5,1,15,3,7,2};
        System.out.println("Before Sorting");
        for(int it:arr){
            System.out.print(it+" ");
        }
        System.out.println();
        mergeSort(arr,0,arr.length-1);

        System.out.println("After Sorting");
        for(int it:arr){
            System.out.print(it+" ");
        }
    }
    static void mergeSort(int[] a,int l,int r){
        if(r>l){
            int mid=l+(r-l)/2;
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);

        }
    }

    static void merge(int[] a,int l,int mid,int h) {
        int n1=mid-l+1; int n2=h-mid;
        int[] a1=new int[n1];
        int[] b1=new int[n2];
        for(int i=0;i<n1;i++){
            a1[i]=a[l+i];
        }
        for(int i=0;i<n2;i++){
            b1[i]=a[mid+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2) {
            if (a1[i] <= b1[j]) {
                a[k++] = a1[i++];
            }
            else {
                a[k++] = b1[j++];

            }
        }

        while(i<n1){
            a[k++]=a1[i++];

        }

        while(j<n2){
            a[k++]=b1[j++];

        }



    }
}
