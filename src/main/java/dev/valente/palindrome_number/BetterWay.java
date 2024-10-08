package dev.valente.palindrome_number;

public class BetterWay {
    public static void main(String[] args) {

//        int number = 121;
//
//        System.out.println(BetterWay.isPalindrome(number));

        int number = 313;

        System.out.println(BetterWay.isPalindrome(number));

//        int number = 10;
//
//        System.out.println(BetterWay.isPalindrome(number));

//        int number = -121;
//
//        System.out.println(BetterWay.isPalindrome(number));
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
