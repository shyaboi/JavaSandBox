package com.ss.divisable;
import java.util.ArrayList;

//create divisable class
public class Modulus {

    //create isDivisable by 10 method to loop through input and return the value modulo by 10
    public static ArrayList<Integer> divideByTen(int[] list) {
        // create a new arrayList to add nums to after been moduloed
        ArrayList<Integer> modList = new ArrayList<Integer>();
        //foreach over the int[] and modulo by 10 and add to Integer ArrayList modList
        for (Integer i : list) {
            //test if num remainder is 0 afer division by 10
            if(i%10==0){
                //if it is 0 afer division by 10, then return original num
                modList.add(i);
            }else{
            modList.add(i%10);
        }
        }
        return modList;
    }
    
}
