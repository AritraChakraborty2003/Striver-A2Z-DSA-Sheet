package Arrays_Easy;

public class MoveZerosEnd {
    public static void main(String[] args){
        int[] arr={1,2,0,3,0,6,0,8,9,0};
        moveZerosToEnd(arr,arr.length);
        for (int it:arr)
            System.out.print(it+" ");
        System.out.println();
    }
    static void moveZerosToEnd(int[] a,int n){
       int counter=0;
        for(int it:a) {
            if (it != 0)
                a[counter++]=it;
        }

        while (counter<n) a[counter++]=0;
    }
}
