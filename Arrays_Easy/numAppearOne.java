package Arrays_Easy;

public class numAppearOne {
    public static void main(String[] args){
        int[] arr={1,1,2,3,3,4,4};
        int res=getSingleElement(arr);
        System.out.println(res);
    }


    public static int getSingleElement(int []arr){
        // Write your code here.
        int res=0;
        for(int it:arr)
            res=res^it;
        return res;
    }
}
