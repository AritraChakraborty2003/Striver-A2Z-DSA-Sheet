package KnowBasicMath;

public class GCD_LCM {
    public static void main(String[] args){
        int a=18;
        int b=6;

        System.out.println("The GCD is "+findGcd(a,b));
        System.out.println("The LCM is "+findLCM(a,b));
    }
    static int findGcd(int a,int b){
        if(b==0)
            return a;
        else    return  findGcd(b,a%b);  //Time Complexity:- O(min(a,b))
    }
    //Product = GCD*LCM

    static int findLCM(int a,int b){
        int gcd=findGcd(a,b);
        int productOfNum=a*b;
        return productOfNum/gcd;
    }

}
