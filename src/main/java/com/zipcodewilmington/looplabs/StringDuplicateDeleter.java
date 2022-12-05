package com.zipcodewilmington.looplabs;

import java.util.Objects;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int newArrSize = 0; //declare var to store new arr size
        for (int i = 0; i < array.length; i++) { //iterate through array
            int count = 0; //declare vara to store count
            for (int j = 0; j < array.length; j++) { //iterate through array
                if(Objects.equals(array[i], array[j])) { //if element in 2nd array matches element in 1st array
                    count++; //inc count
                }
            } //break out of forloop
            if(count < maxNumberOfDuplications) { // if count was not "3"/desired, inc newArrSize
                newArrSize++;
            }
        }
        String[] newArr = new String[newArrSize]; //declare new array with correct length
        //System.out.println("num: " +newArrSize);

        int k = 0;
        for (int i = 0; i < array.length; i++) { //iterate and compare the same way
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(Objects.equals(array[i], array[j])) {
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int newArrSize = 0; //declare var to store new arr size
        for (int i = 0; i < array.length; i++) { //iterate through array
            int count = 0; //declare vara to store count
            for (int j = 0; j < array.length; j++) { //iterate through array
                if(Objects.equals(array[i], array[j])) { //if element in 2nd array matches element in 1st array
                    count++; //inc count
                }
            } //break out of forloop
            if(count != exactNumberOfDuplications) { // if count was not "3"/desired, inc newArrSize
                newArrSize++;
            }
        }
       String[] newArr = new String[newArrSize]; //declare new array with correct length
        //System.out.println("num: " +newArrSize);

        int k = 0;
        for (int i = 0; i < array.length; i++) { //iterate and compare the same way
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(Objects.equals(array[i], array[j])) {
                    count++;
                }
            }
            if(count != exactNumberOfDuplications) {
                newArr[k] = array[i]; //just store the value this time
                k++;
            }
        }
        return newArr;
    }
}
