package com.revature.codingchallenge.week3;

public class Happy {
    Happy(){

    }
    public boolean isHappy(int n){
        int result = n;
        while(result!=1&&result!=4) {
            result = sumOfSquares(result);
        }
        if(result==1)
            return true;
        else
            return false;
    }
    public int sumOfSquares(int n){
        int rem = 0;
        int sum = 0;
        while (n>0) {
            rem = n%10;
            sum = sum + (rem*rem);
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Happy happy = new Happy();
        System.out.println(happy.isHappy(203));
        System.out.println(happy.isHappy(11));
        System.out.println(happy.isHappy(107));
    }
}
