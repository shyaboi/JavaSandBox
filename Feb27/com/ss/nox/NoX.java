package com.ss.nox;
import java.util.ArrayList;

//declare NoX class
public class NoX {
    
    // remove x method that takes in String[] and returns ArrayList<String>
    public static ArrayList<String> removeX(String[] str) {
        //declare new ArrayList<String> to parse info into
        ArrayList<String> xRemovedList = new ArrayList<String>();
        //for loop to itterate over input test values and remove x
     for (String s : str) {
         //current string replace x with nothing
         String ok = s.replace("x", "");
         //add to xRemovedList
         xRemovedList.add(ok);
     }
        //return xRemovedList as ArrayList<String>
        return xRemovedList;
    }

}
