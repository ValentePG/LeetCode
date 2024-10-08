package dev.valente.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BetterWay {
    public static void main(String[] args) {

        // TESTES

        int[] nums = new int[]{2, 7, 11, 15};

        int target = 9;

        int[] answer = BetterWay.twoSum(nums, target);

//        int[] nums = new int[]{3, 2, 4};
//
//        int target = 6;
//
//        int[] answer = BetterWay.twoSum(nums, target);

//        int[] nums = new int[]{3, 5, 6, 4};
//
//        int target = 10;
//
//        int[] answer = BetterWay.twoSum(nums, target);

        Arrays.stream(answer).forEach(System.out::println);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length ; i++){

            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
