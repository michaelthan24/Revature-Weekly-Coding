package com.revature.codingchallenge.week2;

public class AlmostPalindrome {
    public static void main(String[] args) {
        AlmostPalindrome almostPalindrome = new AlmostPalindrome();
        System.out.println(almostPalindrome.almostPalindromeCheck("abcdcbg"));
        System.out.println(almostPalindrome.almostPalindromeCheck("abccia"));
        System.out.println(almostPalindrome.almostPalindromeCheck("abcdaaa"));
        System.out.println(almostPalindrome.almostPalindromeCheck("abcdaaa"));
    }
    public AlmostPalindrome(){

    }
    public boolean almostPalindromeCheck(String s){
        int perm = s.length()/2;
        int counter = 0;
        for(int i=0;i<perm;i++) {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                counter++;
            }
        }
        if (counter==1){
            return true;
        }
        else{
            return false;
        }
    }
}
