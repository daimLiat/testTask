package com.github.daimLiat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@SuppressWarnings("ALL")
public class SubClassTest {

    @Test
    public void subClassTestFirst () {
        Assertions.assertEquals(7,7);
    }

    @Test
    public void subClassTestSecond() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    public void subClassTestThird() {
        Assertions.assertTrue(1 + 1 == 2, "the statement isn't true");
    }

    //tis test is gonna be flaky
    //@Disabled
    @Test
    public void subClassTestFlaky() {
        int flakyNum = (int)(Math.random() * 2 + 1);
        Assertions.assertEquals(2, flakyNum);
    }
}
