package com;

public class FindMaximum {

    public static int integerMaximum(int a,int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }

}
