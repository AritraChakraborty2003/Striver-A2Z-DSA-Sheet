package Arrays_Easy;

import javax.sound.midi.SysexMessage;

public class subArraySum0 {
    public static void main(String[] args){
     int[] arr={1,3,-1,4,-4,0};
        int len=0;
		for(int i=0;i<arr.length;i++){
            int s=0;
        for(int j=i;j<arr.length;j++){
            s+=arr[j];
            if(s==0){

                len=Math.max(len, (j-i)+1);

            }

        }



    }

        System.out.println(len);
}
}

