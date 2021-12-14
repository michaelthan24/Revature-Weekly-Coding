package com.revature.week1;

import com.revature.codingchallenge.week1.LeastCommonMultiple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LCMTest {

    @Test
    public void LCMTester () {
        int [] arr1 = {5, 4, 6, 46, 54, 12, 13, 17};
        int [] arr2 = {46, 54, 466, 544};
        int [] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr4 = {13, 6, 17, 18, 19, 20, 37};
        LeastCommonMultiple lcm = new LeastCommonMultiple();

        long result = lcm.LCM(arr1);
        Assertions.assertEquals(result,2744820);
        result = lcm.LCM(arr2);
        Assertions.assertEquals(result,78712992);
        result = lcm.LCM(arr3);
        Assertions.assertEquals(result,2520);
        result = lcm.LCM(arr4);
        Assertions.assertEquals(result,27965340);

    }
}
