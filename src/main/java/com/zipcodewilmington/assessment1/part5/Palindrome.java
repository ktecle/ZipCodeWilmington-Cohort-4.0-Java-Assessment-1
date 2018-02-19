package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer counter =0;
       String[] substringOfInput= subStringArray(input);
       for(int i=0;i<substringOfInput.length;i++){
           if(isPalindrome(substringOfInput[i])){
               counter++;
           }
       }

        return counter;
    }

    public boolean isPalindrome(String s){
        String[] myStringArray = s.split("");
        int j= myStringArray.length-1;
        for(int i=0;i<myStringArray.length/2;i++){
            if(!myStringArray[i].equals(myStringArray[j])){
                return false;
            }
            j--;
        }
        return true;
    }

    public String[] subStringArray(String input){
        String[] mySubstring = new String[0];
        int mySubstringIndex=0;
        for(int i=0; i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                mySubstring= Arrays.copyOf(mySubstring,mySubstring.length+1);
                mySubstring[mySubstringIndex]=input.substring(i,j);
                mySubstringIndex++;
            }
        }
        return mySubstring;
    }

}
