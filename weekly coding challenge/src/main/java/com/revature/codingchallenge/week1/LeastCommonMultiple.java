package com.revature.codingchallenge.week1;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int [] arr1 = {5, 4, 6, 46, 54, 12, 13, 17};
        int [] arr2 = {46, 54, 466, 544};
        int [] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr4 = {13, 6, 17, 18, 19, 20, 37};
        System.out.println(LCM(arr1));
        System.out.println(LCM(arr2));
        System.out.println(LCM(arr3));
        System.out.println(LCM(arr4));
    }
    public static long LCM(int[] arr){
        long lcm = 1;
        int divisor = 2;

        while (true ){
            int counter = 0;
            boolean divisible = false;
            for (int i=0;i<arr.length;i++){
                if(arr[i]==1)
                    counter++;
                if(arr[i] % divisor == 0){
                    divisible = true;
                    arr[i] = arr[i]/divisor;
                }
            }
            if(divisible) {
                lcm = lcm * divisor;
            }
            else {
                divisor++;
            }
            if(counter== arr.length){
                return lcm;
            }
        }

    }
}
