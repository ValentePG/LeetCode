package dev.valente.palindrome_number;

public class Solution {
    public static void main(String[] args) {


        int number = 807;

        System.out.println(Solution.isPalindrome(number));


    }

    public static boolean isPalindrome(int x){

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reversed = 0;
        while(x > reversed){

            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
