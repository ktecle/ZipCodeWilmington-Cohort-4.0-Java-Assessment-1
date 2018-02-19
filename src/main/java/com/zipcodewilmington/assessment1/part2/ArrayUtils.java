package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter =0;

        for(int i=0;i<objectArray.length;i++){
            if(objectArray[i].equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Integer[] IntegerArray = new Integer[objectArray.length];
        for(int i=0;i<objectArray.length;i++){
            IntegerArray[i]=(Integer)objectArray[i];
        }
        Integer[] resultArray = new Integer[0];
        int resultArrayIndex =0;
        for(int i=0;i<objectArray.length;i++){
            if(!objectArray[i].equals(objectToRemove)){
                resultArray= Arrays.copyOf(resultArray,resultArray.length+1);
                resultArray[resultArrayIndex]=(Integer) objectArray[i];
                resultArrayIndex++;
            }
        }
        return resultArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        Integer max =getNumberOfOccurrences(objectArray,objectArray[0]);
        Object mostCommon=null;
        for(int i=1;i<objectArray.length;i++){
          if(getNumberOfOccurrences(objectArray,objectArray[i])>max){
              max=getNumberOfOccurrences(objectArray,objectArray[i]);
              mostCommon = objectArray[i];
          }

        }

        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray)
    {   Integer min =getNumberOfOccurrences(objectArray,objectArray[0]);
        Object leastCommon=null;
        for(int i=1;i<objectArray.length;i++){
            if(getNumberOfOccurrences(objectArray,objectArray[i])<min){
                min=getNumberOfOccurrences(objectArray,objectArray[i]);
                leastCommon = objectArray[i];
            }

        }

        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] IntegerArray1 = new Integer[objectArray.length];
        for(int i=0;i<objectArray.length;i++){
            IntegerArray1[i]=(Integer)objectArray[i];
        }
        Integer[] IntegerArray2 = new Integer[objectArrayToAdd.length];
        for(int m=0;m<objectArrayToAdd.length;m++){
            IntegerArray2[m]=(Integer)objectArrayToAdd[m];
        }
        int length1=IntegerArray1.length;
        int length2 = IntegerArray2.length;
        int mergedArrayLength =length1+length2;
        Integer[]mergedArray=new Integer[mergedArrayLength];
        System.arraycopy(IntegerArray1,0,mergedArray,0,IntegerArray1.length);
        System.arraycopy(IntegerArray2,0,mergedArray,length1,length2);




        return mergedArray;
    }
}
