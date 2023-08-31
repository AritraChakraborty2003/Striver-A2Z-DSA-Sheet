package Arrays_Easy;

public class containerMostWater {
    public static void main(String[] args){
        int[] poles= {1,8,6,2,5,4,8,3,7};
        int max_area= containerWithMostWater(poles,poles.length);
        System.out.println(max_area);
    }
    static int containerWithMostWater(int[] a, int n){
        int max_area=0;
        int l=0, h=n-1;
        while(l<h) {
            int min_height = Math.min(a[l], a[h]);
            if (min_height == a[l]) {
                max_area = Math.max(max_area, a[l] * (h - l));
                l++;
            }
            if(min_height==a[h]) {
                max_area = Math.max(max_area, a[h] * (h - l));
                h--;
            }
        }
        return max_area;
    }

}
