package KnowBasicMath;

public class checkPalindrome {
    public static void main(String[] args){
        int a=121;
        if(isPalindrome(a)) System.out.print("Palindrome Number");
        else System.out.print("Not a palindrome Number");
    }

    static boolean isPalindrome(int n)
    {
        int copy=n;
        int revNumber=0;
        while(copy!=0){
            int rem=copy%10;

            revNumber=revNumber*10+rem;
            copy/=10;
        }

        return revNumber == n;
    }
}
