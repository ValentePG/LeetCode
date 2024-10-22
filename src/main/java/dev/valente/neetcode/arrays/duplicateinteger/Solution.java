package dev.valente.neetcode.arrays.duplicateinteger;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
