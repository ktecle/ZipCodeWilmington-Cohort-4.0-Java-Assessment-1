package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String result ="";
        result+=str.substring(0,1).toUpperCase()+str.substring(1);
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder builder=new StringBuilder((str));

        return builder.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
         StringBuilder builder = new StringBuilder(str);
         String result = builder.reverse().toString();
        return result.substring(0,1).toUpperCase()+result.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder builder = new StringBuilder();
        char[] myChar = str.toCharArray();
        for(int i=0;i<myChar.length;i++){
            if(Character.isUpperCase(myChar[i])) {
                Character.toLowerCase(myChar[i]);
            }else{
                    Character.toUpperCase(myChar[i]);
                }
            builder.append(myChar[i]);
            }



        return builder.toString();
    }
}
