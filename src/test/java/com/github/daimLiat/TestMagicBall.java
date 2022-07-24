package com.github.daimLiat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMagicBall {

    @Test
    public void testLucky() {
        Assertions.assertEquals(8, MagicBall.getLucky());
    }
}