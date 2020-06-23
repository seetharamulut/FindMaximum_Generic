package com;
import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>{
    private T[] inputElements;

    public FindMaximum(T... inputElements)
    {
        this.inputElements = inputElements ;
    }
    public T maximumValue(){
        Arrays.sort(inputElements);
        printMax();
        return inputElements[inputElements.length -1];
    }
    public void printMax(){
        System.out.printf("%s", inputElements[inputElements.length-1]);
    }
}
