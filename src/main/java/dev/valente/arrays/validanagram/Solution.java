package dev.valente.arrays.validanagram;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(Solution.isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x : t.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) - 1);
        }

        for(int val : map.values()){
            if(val != 0){
                return false;
            }
        }

        return true;
    }
}
