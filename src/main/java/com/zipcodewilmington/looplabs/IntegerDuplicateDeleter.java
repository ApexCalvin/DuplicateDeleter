package com.zipcodewilmington.looplabs;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        int newArrSize = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count < maxNumberOfDuplications) {
                newArrSize++;
            }
        }
        Integer[] newArr = new Integer[newArrSize];

        int k = 0;
        for (int i = 0; i < array.length; i++) { //iterate and compare the same way
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count < maxNumberOfDuplications) {
                newArr[k] = array[i]; //just store the value this time
                k++;
            }
        }
        return newArr;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int newArrSize = 0; //declare var to store new arr size
        for (int i = 0; i < array.length; i++) { //iterate through array
            int count = 0; //declare vara to store count
            for (int j = 0; j < array.length; j++) { //iterate through array
                if(array[i] == array[j]) { //if element in 2nd array matches element in 1st array
                    count++; //inc count
                }
            } //break out of forloop
            if(count != exactNumberOfDuplications) { // if count was not "3"/desired, inc newArrSize
                newArrSize++;
            }
        }
        Integer[] newArr = new Integer[newArrSize]; //declare new array with correct length
        //System.out.println("num: " +newArrSize);

        int k = 0;
        for (int i = 0; i < array.length; i++) { //iterate and compare the same way
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count != exactNumberOfDuplications) {
                newArr[k] = array[i]; //just store the value this time
                k++;
            }
        }
        return newArr;

        // The even shorter but complex way
        /*
        // 0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9
        int count = 1;
        int rMarker = 0;
        int newArrSize = 1;
        int l = 0;

        for (int k = 0; k < array.length; k++) {
            if(Objects.equals(array[k], array[k + 1])) {
                count++;
            } else {
                array[l] = array[k + 1];
                count = 1;
                l++;
                newArrSize++;
            }
            if(count == exactNumberOfDuplications) {
                count = 1;
            }
        }
        */

        // my original long way
        /*
        int newArrSize = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count != exactNumberOfDuplications) {
                newArrSize++;
            }
        }
        Integer[] newArr = new Integer[newArrSize];
        Integer[] dupValues = new Integer[(array.length - newArrSize) / (exactNumberOfDuplications)]; // value 3, holding 0 5 9
        System.out.println("dupValue length: "+dupValues.length);
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            int valueTemp = array[i];
            int countTemp = 1;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] == valueTemp) {
                    countTemp++;
                }
            }
            if(countTemp == exactNumberOfDuplications) {
                System.out.println("Value: "+valueTemp+" has "+countTemp+" duplications.");
                dupValues[k] = valueTemp;
                k++;
            }
        }
        System.out.println("Duplicate values in arr are: "+ Arrays.toString(dupValues));


        //First nested loop
        // Creates newArr

        //Second nested loop
        // Creates dupArr [0, 5, 9]

        //Third nested loop
        // Compares originalArr between dupArr and stores

        Boolean match = false;
        int m = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < dupValues.length; j++) { // 0 5 9
                match = false;
                System.out.println("Array["+i+"]: "+array[i]+" -- Dups["+j+"]: "+dupValues[j]);
                if(Objects.equals(array[i], dupValues[j])) {
                    System.out.println("Break! (matches)");
                    match = true;
                    break;
                }
            }
            if(match == false) {
                newArr[m] = array[i];
                System.out.println("New Array: "+ Arrays.toString(newArr));
                m++;
            }
            System.out.println("-------------------------  0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9");
        }
        */
    }

}








