package Arrays_Easy;

import java.awt.*;
import java.util.*;
import java.util.List;

public class findUnion {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        List<Integer> lst=sortedArray(arr1,arr2);
        for(int it:lst)
            System.out.print(it+" ");
        System.out.println();

    }
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        Set<Integer> st=new TreeSet<Integer>();

        for(int it:a){
            st.add(it);
        }
        for(int it:b){
            st.add(it);
        }

        return new ArrayList<Integer>(st);


    }
}
