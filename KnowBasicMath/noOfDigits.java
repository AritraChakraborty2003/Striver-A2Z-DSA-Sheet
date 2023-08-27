package KnowBasicMath;

public class noOfDigits {
    public static void main(String[] args){
        int n=897;
        System.out.println(countDigits(n));
    }

    private static int countDigits(int n) {
        return (int)(Math.log10(n)+1);
    }
}
