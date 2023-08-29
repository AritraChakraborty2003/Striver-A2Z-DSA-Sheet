package Arrays_Easy;

public class vehicles {
    public static void main(String[] args){
        int[] a={0,1,1};
        int m=1;
        int cnt=0;
        while(cnt<a.length){

            if(a[cnt]==1) {
                if(cnt<a.length-1) {
                    boolean flag = false;
                    cnt++;
                    while (a[cnt] == 0 && m > 0) {
                        a[cnt] = 1;
                        cnt++;
                        m--;
                        flag = true;
                    }
                    if (!flag)
                        cnt--;
                }

            }
            cnt++;
        }
        int res=0,count=0;
        for(int it:a){
            if(it==1)
                count++;
            else
                count=0;
            res=Math.max(count,res);
        }

        System.out.println(res+m);
        for(int it:a)
            System.out.print(it+" ");
        System.out.println();
    }



}
