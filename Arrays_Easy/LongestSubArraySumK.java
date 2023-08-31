package Arrays_Easy;

import java.util.HashMap;

public class LongestSubArraySumK {
    public static void main(String[] args){
        int[]  tst={2,0,0,3};
        int x=3;
        System.out.println(longestSubArraySumK(tst,x));
    }

    static int longestSubArraySumK(int[] a,long k){
        HashMap<Long,Integer> hMap=new HashMap<>();
        long sum=0;
        int maxLen=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k)
                maxLen=Math.max(maxLen,i+1);
            long rem=sum-k;
            if(hMap.containsKey(rem))
            {
                int len=i-hMap.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!hMap.containsKey(sum))
                    hMap.put(sum,i);
        }
        return maxLen;
    }
}
