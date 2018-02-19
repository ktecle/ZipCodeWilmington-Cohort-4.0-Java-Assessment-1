package com.zipcodewilmington.assessment1.part4;

public class Jumper {
    //number of unit jumps



    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
       int x= k/j;
        int y=x*j;


        if(k<j){
            return k;
        }
        else if(k%j==0) {
            return k / j;
        }else return x + k - x*j;
    }
}
