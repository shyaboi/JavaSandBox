package com.ss.recursion;

//setup recurssion class
public class Recursion {
    // setup isSum method to return boolean
    static public boolean isSum(int root, int[] nums, int sumTarget) {

        // if the root num is greater than the num of number in the int[] return 0
        if (root >= nums.length)
            return sumTarget == 0;
        // set the root num as i for itteration
        int i = root;
        // declare int sums for the total sums
        int sums = 0;
        /*
         * while i is lessthan the nums[].length, and the nums[root] is equal to nums[i]
         */
        while (i < nums.length && nums[root] == nums[i]) {
            // sums is equal to nums[i]+sums previous sum
            sums += nums[i];
            // incriment i
            i++;
        }
        /*
        //if root, nums, sumTarget -sums equal OR isSum is equal to target after sum total, return true
        */
        if (isSum(i, nums, sumTarget - sums) || isSum(i, nums, sumTarget))
            return true;
        //return false if root is > 0 or if sums > totalSums
        return false;
    }
}