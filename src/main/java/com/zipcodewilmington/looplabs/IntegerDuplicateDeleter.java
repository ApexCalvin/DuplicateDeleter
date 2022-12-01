package com.zipcodewilmington.looplabs;

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


        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int exactDupCount = 0;
        for (int i = 0; i < array.length; i++) {
            int valueTemp = array[i];
            int countTemp = 1;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] == valueTemp) {
                    countTemp++;
                }
            }
            if(countTemp == exactNumberOfDuplications) {
                //System.out.println("Value: "+valueTemp+" has "+countTemp+" duplications.");
                exactDupCount++;
            }
        }
        Integer[] newArr = new Integer[array.length - (exactDupCount * exactNumberOfDuplications)];
        //System.out.println("Size of new arr: " +newArr.length);

        Integer[] dupValues = new Integer[exactDupCount]; // value 3, holding 0 5 9
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
                //System.out.println("Value: "+valueTemp+" has "+countTemp+" duplications.");
                exactDupCount++;
                dupValues[k] = valueTemp;
                k++;
            }
        }
        //System.out.println("Duplicate values in arr are: "+ Arrays.toString(dupValues));

//        int l = 0;
//        for (int i = 0; i < array.length; i++) {
//            int valueTemp = array[i];
//            int countTemp = 1;
//            for (int j = i+1; j < array.length; j++) {
//                if(array[j] == valueTemp) {
//                    countTemp++;
//                }
//            }
//            if(countTemp !=  exactNumberOfDuplications) {
//                newArr[l] = valueTemp;
//                l++;
//            }
//        }
//
//        System.out.println(Arrays.toString(newArr));















//        for (int i = 0; i < array.length; i++) { //WORKS
//            for (int j = 0; j < dupValues.length; j++) { //WORKS  0 5 9
//                System.out.println("Array["+i+"]: "+array[i]+" -- Dups["+j+"]: "+dupValues[j]);
//                if(Objects.equals(array[i], dupValues[j])) {
//                    System.out.println("Matches");
//                }
//
//                }
//            System.out.println("-------------------------  0, 0, 0, 1, 2, 2, 4, 4, 5, 5, 5, 6, 9, 9, 9");
//            }






        Boolean match = false;
        int m = 0;
        for (int i = 0; i < array.length; i++) { //WORKS
            for (int j = 0; j < dupValues.length; j++) { //WORKS  0 5 9
                match = false;
                System.out.println("Array["+i+"]: "+array[i]+" -- Dups["+j+"]: "+dupValues[j]);
                if(Objects.equals(array[i], dupValues[j])) {
                    System.out.println("Matches");
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

        return newArr;
    }

}
