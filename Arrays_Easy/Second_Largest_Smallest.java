package Arrays_Easy;

public class Second_Largest_Smallest {
    public static void main(String[] args){
        int[] arr={3,4,5,2};
        int[] res=getSecondOrderElements(arr.length,arr);
        for(int it:res)
            System.out.print(it+" ");
        System.out.println();
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int[] resArr=new int[2];
        int secondLarge=secondLargest(a,n);
        int secondSmall=secondSmallest(a,n);
        resArr[0]=secondLarge;
        resArr[1]=secondSmall;
        return resArr;
    }

     static int secondSmallest(int[] a, int n) {
        int min=0;
        int res=-1;
        for(int i=1;i<n;i++){
            if(a[i]<a[min]){
                res=min;
                min=i;
            }
            else if(a[min]!=a[i]){
                if(res==-1 || a[res]>a[i])
                {
                    res=i;
                }
            }
        }
        return a[res];
    }

    static int secondLargest(int[] a,int n){
        int max=0;
        int res=-1;
        for(int i=1;i<n;i++){
            if(a[max]<a[i]){
                res=max;
                max=i;
            }
            else if(a[max]!=a[i]){
                if(res==-1 || a[i]>a[res]){
                    res=i;
                }
            }
        }
        return a[res];

    }
}
