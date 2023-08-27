package Arrays_Easy;

public class MaximumConsecutiveOne {
    public static void main(String[] args){
        int[] a={3,4,5,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1};
        System.out.println(maxConsecutiveOne(a));
    }

    static int maxConsecutiveOne(int[] arr){
        int cnt=0; int maxRes=0;
        for (int j : arr) {
            if (j == 1) {
                cnt++;
            } else cnt = 0;

            maxRes = Math.max(maxRes, cnt);
        }

        return maxRes;
    }


}
