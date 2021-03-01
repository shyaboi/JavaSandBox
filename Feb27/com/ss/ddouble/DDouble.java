package com.ss.ddouble;
import java.util.ArrayList;

//declade DDouble class
public class DDouble {
    // creat method of ddouble that takes in int[] as param and returns ArrayList<Integer>
    public static ArrayList<Integer> ddouble(int[] dList) {
        // declare new array list to put double values into        
        ArrayList<Integer> dubList = new ArrayList<Integer>();
        //for each loop to multiply each value by 2
        for (int i : dList) {
            dubList.add(i*2);
        }
        //returned the doubled list of values
        return dubList;

    }
    
}
