package com.ss.lambdachoice;


public class LambdaChoice {

    public static void p() {
        System.out.println("i did a thing");
    }

    // I spent a while trying to make this lambda, but couldnt figure it out, so
    // heress this
    // declare isOdd method that will return true if the number given is odd
    public static Boolean isOdd(int num) {

        Boolean result = (num % 2 == 0) ? false : true;

        return result;
        // Stream<Integer> streamList = nums.stream().forEach((Integer
        // s)->System.out.println(s));
        // System.out.println(streamList.collect(Collectors.toList()));
        // return streamList;
    }

    // declare isPrime method that will return true if the number given is prime
    public static boolean isPrime(int num) {
        // Corner case if num is 1
        if (num <= 1)
            return false;

        // Check from 2 to n-1 if the number is divisible by 2 up to num
        for (int i = 2; i < num; i++)
            // if it's divisible, return false
            if (num % i == 0)
                return false;
        // else return true, numberr is prime
        return true;
    }
    // isPalindrone method to check if the number given is the same reverse as forward and return Boolean
    public static Boolean isPalindrome(String str) {
        //make a string from new StringBuilder from input and reversed to string
        String rev = new StringBuilder(str).reverse().toString();
        //parsed the reverse string to int for compare
        int pRev = Integer.parseInt(rev);
        // parse input str to int for compare
        int pStr = Integer.parseInt(str);
        //boolean turnary if parsed str input is equal to parsed input revered 
        if(pStr<10){
            System.out.println("Not a palindrome, but not not one either.");
            return false;
        }
        Boolean result = (pRev==pStr) ? true : false;
        //return boolean result
        return result;
    }

    // setup main
    public static void main(String[] args) {
        // isOdd(3);
    }

}
