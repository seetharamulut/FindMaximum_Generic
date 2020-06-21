package com;

import java.util.Arrays;

public class FindMaximum <E extends Comparable<E>>{
    private E[] inputArray;

    public FindMaximum(E[] inputArray) {
        this.inputArray = inputArray ;
    }
    public E maximum(){
         return FindMaximum.maximumValue(this.inputArray);
    }

    public static <E extends Comparable<E>> E maximumValue(E[] inputArray){
        Arrays.sort(inputArray);
        return inputArray[inputArray.length -1];
    }

    public void printMax(){
        System.out.printf("%s", inputArray[inputArray.length-1]);
        System.out.println();
    }
}
