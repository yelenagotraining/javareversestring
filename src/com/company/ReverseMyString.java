package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseMyString {

    public ArrayList<String> ReverseString(String input) {
        String splitString[] = input.split(" ", 0);
        ArrayList<String> newListStirng = new ArrayList<String>();

        int stringLength = splitString.length;
        System.out.println(stringLength);
        for(int i=0; i < stringLength; i++)
        {

            System.out.println(splitString[stringLength - i]);

        }
        System.out.println(splitString[stringLength - 1]);
        return newListStirng;
    }

    static void ReverseStringProcess(String inputString[], int count) {
        String [] newString = new String[count];
        int newCount = count;
        for (int i = 0; i < count; i++) {
            newString[newCount - 1 ] = inputString[i];
            newCount--;

        }
        for (int k= 0; k < count; k++){
            System.out.println(newString[k]);
        }

    }

    static void ReverseAnotherArray(String inputArray[]){
        var arrayAsList = Arrays.asList(inputArray);
        Collections.reverse(arrayAsList);
        System.out.println(arrayAsList);
    }
}


