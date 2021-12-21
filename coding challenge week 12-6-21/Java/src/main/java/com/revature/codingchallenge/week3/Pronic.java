package com.revature.codingchallenge.week3;

public class Pronic {
    Pronic(){

    }
    public boolean isPronic (int n) {
        int result = 0;
        int counter = 0;
        while(result<=n){
            if(n==result)
                return true;
            else {
                result = counter*(counter+1);
                counter++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Pronic pronic = new Pronic();
        System.out.println(pronic.isPronic(0));
        System.out.println(pronic.isPronic(2));
        System.out.println(pronic.isPronic(7));
        System.out.println(pronic.isPronic(110));
        System.out.println(pronic.isPronic(136));
        System.out.println(pronic.isPronic(156));
    }
}
