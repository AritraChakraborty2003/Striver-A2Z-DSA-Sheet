package Arrays_Easy;


public class RemoveDuplicates {
    public static void main(String[] args){
        int[] brr={1,2,2,2,4};
        int size=removeDuplicates(brr,brr.length);
        for(int j=0;j<size;j++){
            System.out.print(brr[j]+" ");
        }
        System.out.println();
    }
    static int removeDuplicates(int[] a,int n)
    {
        int[] arr=new int[n];
        int counter=0;
        if(n<2)
            return a.length;
        else {
            for(int i=0;i<=n-2;i++){
                if(i==0) arr[counter++]=a[i];
                if(a[i]!=a[i+1])
                    arr[counter++]=a[i+1];
            }
        }

        if (counter >= 0) System.arraycopy(arr, 0, a, 0, counter);
        return counter;

    }


}
