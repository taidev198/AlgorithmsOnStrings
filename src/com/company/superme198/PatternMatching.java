package com.company.superme198;

public class PatternMatching {


    public static boolean naiveSearch(String x, int m, String y, int n){//find x in y

        for (int i = 0; i < n-m; i++) {
            if (y.substring(i, i + m).equals(x)){
                System.out.println("found");
                return true;
            }

        }
        return false;
    }

    public static void main(String...args){
        System.out.println(naiveSearch("tai", 3, "thanh tai nguyen", 16));


    }
}
