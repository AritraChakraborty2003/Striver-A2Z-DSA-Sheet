package Arrays_Easy;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {7, 2, 15, 6, 8, 9};
        System.out.println("The Largest Element is- ");
        System.out.println(largestElementArray(arr,arr.length));
    }


    static int largestElementArray(int[] a,int n) {
        int max=0;
        for(int i=1;i<n;i++){
            if(a[max]<a[i])
                max=i;
        }

        return a[max];
    }
}