package com.revature.week2;

import com.revature.codingchallenge.week2.AlmostPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlmostPalindroneTest {
    @Test
    public void APT(){
        AlmostPalindrome almostPalindrome = new AlmostPalindrome();
        Assertions.assertTrue(almostPalindrome.almostPalindromeCheck("abcdcbg"));
        Assertions.assertTrue(almostPalindrome.almostPalindromeCheck("abccia"));
        Assertions.assertFalse(almostPalindrome.almostPalindromeCheck("abcdaaa"));
        Assertions.assertFalse(almostPalindrome.almostPalindromeCheck("abcdaaa"));
    }
}
