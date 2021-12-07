package com.revature;

import com.revature.codingchallenge.week1.LookAndSay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class LookSayTest {
    @Test
    public void LookSayTester(){
        String s1 = "1213200012171979";
        String s2 = "54544666";
        String s3 = "95";
        String s4 = "1213141516171819";
        String s5 = "120520";
        String s6 = "231";
        LookAndSay lookAndSay = new LookAndSay();
        Assertions.assertEquals(new BigInteger("23002799999999"),lookAndSay.lookSay(s1));
        Assertions.assertEquals(new BigInteger("44444444446666666666"),lookAndSay.lookSay(s2));
        Assertions.assertEquals(new BigInteger("555555555"),lookAndSay.lookSay(s3));
        Assertions.assertEquals(new BigInteger("23456789"),lookAndSay.lookSay(s4));
        Assertions.assertEquals(new BigInteger("200"),lookAndSay.lookSay(s5));
        Assertions.assertEquals(new BigInteger("-1"),lookAndSay.lookSay(s6));
    }
}
