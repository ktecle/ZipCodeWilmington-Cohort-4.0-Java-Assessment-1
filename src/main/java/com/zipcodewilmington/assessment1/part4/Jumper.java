package com.zipcodewilmington.assessment1.part4;

public class Jumper {
    //number of unit jumps



    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
       int x= k/j;//x will hold the integer division of the height of the flag by the max height per jump
        int y=x*j;// y will hold the distance in height the person covers after x number of jumps


        if(k<j){
            return k;
        }
        else if(k%j==0) {
            return k / j;
        }else return x + k - x*j;
    }
}
