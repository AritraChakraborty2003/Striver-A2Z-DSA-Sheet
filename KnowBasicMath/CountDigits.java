package KnowBasicMath;

public class CountDigits {

    public static void main(String[] args){
        int n=35;
        int n1=n;
        int it=noOfDigits(n);
        int countDigits=0;
        while(it!=0){
            int rem=n1%10;
            if(n%rem==0){
                countDigits++;
            }

            n1=n1/10;
            it--;
        }
       System.out.println(countDigits);
    }

    static int noOfDigits(int n){
        return (int)(Math.floor(Math.log10(n)+1));
    }
}
