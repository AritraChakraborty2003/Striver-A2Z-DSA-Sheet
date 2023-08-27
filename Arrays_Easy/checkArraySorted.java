package Arrays_Easy;

public class checkArraySorted {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int[] arr1={7,9,1,5,3};
        System.out.println("arr is "+checkSorted(arr));
        System.out.println("arr1 is "+checkSorted(arr1));
    }

    static String checkSorted(int[] a){
        int n=a.length;
        boolean flag=true;
        for(int i=0;i<n-1;i++){
            if (a[i]>a[i+1]) {
                flag = false;
                break;
            }
        }
        if(flag) return "YES";
        else return  "NO";
    }
}
