package com.revature.codingchallenge.week2;

public class StaircaseOfRecursion {
    public static void main(String[] args) {
        StaircaseOfRecursion staircase = new StaircaseOfRecursion();
        System.out.println(staircase.steps(1));
        System.out.println(staircase.steps(2));
        System.out.println(staircase.steps(5));
        System.out.println(staircase.steps(0));
    }
    public StaircaseOfRecursion(){

    }
    public int steps (int n){
        return fib(n+1);
    }
    public int fib(int n){
        if (n<=1)
            return n;
        else
            return fib(n-1) + fib(n-2);
    }
}
