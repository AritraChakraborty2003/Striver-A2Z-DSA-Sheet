package KnowBasicMath;

public class noOfDivisors {

    public   static void main(String[] args){
        int n=156;
        System.out.println(sumOfAllDivisors(5));
        System.out.println("The no of Divisors are:- "+noOfDivisors(4));
    }
    public static int noOfDivisors(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                count++;
                if(i!=(n/i))
                    count++;
                }
            }
        return count;

    }

    static int sumOfDivisors(int n){
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
                if((n/i)!=i)
                    sum+=n/i;

            }
        }
        return sum;
    }

    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int resVal=0;
        for(int i=1;i<=n;i++){
            resVal+=sumOfDivisors(i);
        }
        return resVal;
    }
}
