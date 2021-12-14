package com.revature.week2;

import com.revature.codingchallenge.week2.StaircaseOfRecursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaircaseRecursionTest {
    @Test
    public void staircase () {
        StaircaseOfRecursion staircaseOfRecursion = new StaircaseOfRecursion();
        Assertions.assertEquals(staircaseOfRecursion.steps(1),1);
        Assertions.assertEquals(staircaseOfRecursion.steps(2),2);
        Assertions.assertEquals(staircaseOfRecursion.steps(5),8);
        Assertions.assertEquals(staircaseOfRecursion.steps(0),1);

    }
}
