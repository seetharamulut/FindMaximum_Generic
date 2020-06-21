package com;

public class FindMaximum <E extends Comparable<E>>{
    private E inputone;
    private E inputTwo;
    private E inputThree;

    public FindMaximum(E inputOne,E inputTwo,E inputThree) {
        this.inputone = inputOne;
        this.inputTwo = inputTwo;
        this.inputThree = inputThree;
    }
    public E maximum(){
         return FindMaximum.maximumValue(this.inputone,this.inputTwo,this.inputThree);
    }

    public static <E extends Comparable<E>> E maximumValue(E inputOne,E inputTwo,E inputThree){
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
