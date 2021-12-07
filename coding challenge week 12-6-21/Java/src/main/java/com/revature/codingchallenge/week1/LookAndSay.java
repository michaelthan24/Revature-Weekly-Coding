package com.revature.codingchallenge.week1;

import java.math.BigInteger;

public class LookAndSay {
    public LookAndSay(){
    }

    public BigInteger lookSay(String s) {
        String sfinal = "";
        if(s.length()%2!=0) {
            return BigInteger.valueOf(-1);
        }
        for (int i=0;i<s.length();i=i+2){
            int temp1 = s.charAt(i)-'0';
            int temp2 = s.charAt(i+1)-'0';
            for(int j=0;j<temp1;j++){
                sfinal = sfinal + temp2;
            }
        }
        return new BigInteger(sfinal);
    }
    public static void main(String[] args) {
        String s1 = "1213200012171979";
        String s2 = "54544666";
        String s3 = "95";
        String s4 = "1213141516171819";
        String s5 = "120520";
        String s6 = "231";
        LookAndSay lookAndSay = new LookAndSay();
        System.out.println(lookAndSay.lookSay(s1));
        System.out.println(lookAndSay.lookSay(s2));
        System.out.println(lookAndSay.lookSay(s3));
        System.out.println(lookAndSay.lookSay(s4));
        System.out.println(lookAndSay.lookSay(s5));
        System.out.println(lookAndSay.lookSay(s6));

    }
}

