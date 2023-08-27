package Arrays_Easy;

public class LinearSearch {
    public static void main(String[] args){
        int key=5;
        int[] arr={2,7,6,9,5,15,11};
        linearSearch(arr,key);
    }
    static void linearSearch(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("Index is "+i);
                break;
            }
        }
    }
}
