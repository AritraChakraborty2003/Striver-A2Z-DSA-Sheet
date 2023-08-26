package Basics;

public class IfElse {

    public static  void main(String[] args){
        String ans=compareIfElse(5,3);
        System.out.println(ans);
    }

    public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a>b)
            return "greater";
        else if(a<b)
            return "smaller";

        return "equal";
    }
}
