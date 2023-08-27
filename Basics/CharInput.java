package Basics;

import java.util.Scanner;

public class CharInput {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char inp;
        System.out.println("Enter character");
        inp=sc.next().charAt(0);
        printASCII(inp);
    }

    static void printASCII(char c){
        System.out.println("The ascii value is "+(int)c);
    }
}
