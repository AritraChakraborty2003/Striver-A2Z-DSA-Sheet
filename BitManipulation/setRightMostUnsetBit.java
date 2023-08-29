package BitManipulation;

import java.util.ArrayList;

public class setRightMostUnsetBit {
    public static void main(String[] args){
       int res= setBits(7);
       System.out.println(res);
    }
    public static int setBits(int N){
        // Write your code here.
        ArrayList<Integer> arr=new ArrayList<>();
        int counter=0;
        int copy=N;
        while(copy>0){
            int rem=copy%2;
            arr.add(rem);
            copy/=2;
        }
        boolean flag=true;
        for(int it:arr) {
            if (it == 0) {
                flag=false;
                break;
            }
            else
                counter++;
        }

        if(flag) return N;
        return N+(int)(Math.pow(2,counter));
    }

    }

