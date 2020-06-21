package com;

import java.util.Arrays;

public class FindMaximum {

    public static <E extends Comparable<E>> E maximum(E inputOne,E inputTwo,E inputThree){
        E max = inputOne;
        if (inputTwo.compareTo(max)>0){
            max = inputTwo;
        }
        if (inputThree.compareTo(max)>0){
            max = inputThree;
        }
        return max;
    }
}
