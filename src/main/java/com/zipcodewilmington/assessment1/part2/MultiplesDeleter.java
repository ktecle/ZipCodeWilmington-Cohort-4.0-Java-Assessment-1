package com.zipcodewilmington.assessment1.part2;

import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        Integer[] nonEvens = new Integer[0];
        int nonEvensIndex = 0;
        for(int i=0;i<ints.length;i++){
            if(ints[i]%2!=0){
                nonEvens = Arrays.copyOf(nonEvens,nonEvens.length+1);
                nonEvens[nonEvensIndex]=ints[i];
                nonEvensIndex++;
            }
        }

        return nonEvens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        Integer[] evens = new Integer[0];
        int evensIndex = 0;
        for(int i=0;i<ints.length;i++){
            if(ints[i]%2==0){
                evens = Arrays.copyOf(evens,evens.length+1);
                evens[evensIndex]=ints[i];
                evensIndex++;
            }
        }

        return evens;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        Integer[] nonMultiplesOfThree = new Integer[0];
        int nonMultiplesOfThreeIndex =0;
        for(int i=0;i<ints.length;i++){
            if(ints[i]%3!=0){
                nonMultiplesOfThree = Arrays.copyOf(nonMultiplesOfThree,nonMultiplesOfThree.length+1);
                nonMultiplesOfThree[nonMultiplesOfThreeIndex]= ints[i];
                nonMultiplesOfThreeIndex++;
            }
        }
        return nonMultiplesOfThree;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        Integer[]result = new Integer[0];
        int resultIndex = 0;
        for(int i=0;i<ints.length;i++){
            if(ints[i]%multiple!=0){
                result = Arrays.copyOf(result,result.length+1);
                result[resultIndex]=ints[i];
                resultIndex++;
            }
        }
        return result;
    }
}
