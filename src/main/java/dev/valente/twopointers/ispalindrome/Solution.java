package dev.valente.twopointers.ispalindrome;

public class Solution {
    public static void main(String[] args) {

        String s = "Was it a car or a cat I saw?";

        System.out.println(Solution.isPalindrome(s));
    }

    public static boolean isPalindrome(String s){

        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public static boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

}
