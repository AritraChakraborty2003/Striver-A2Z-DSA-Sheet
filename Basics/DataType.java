package Basics;

import java.util.*;
public class DataType {
    public static void  main(String[] args){

        String input="long";
        Scanner sc=new Scanner(System.in);
        System.out.println(getSize(input));

    }

    static  int getSize(String inputStr){
        HashMap<String,Integer> hmap=new HashMap<>();
        hmap.put("Integer",4);
        hmap.put("Long",8);
        hmap.put("Float",4);
        hmap.put("Double",8);
        hmap.put("Character",1);
        return hmap.get(inputStr);
    }
}
