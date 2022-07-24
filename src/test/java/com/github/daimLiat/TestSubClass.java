package com.github.daimLiat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSubClass {

    @Test
    public void TestSubClassFirst () {
        Assertions.assertEquals(7,7);
    }

    @Test
    public void TestSubClassSecond() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    public void TestSubClassThird() {
        Assertions.assertTrue(1 + 1 == 2, "the statement isn't true");
    }
}
