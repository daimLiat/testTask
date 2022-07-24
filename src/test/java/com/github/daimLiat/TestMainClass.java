package com.github.daimLiat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMainClass {

    @Test
    public void TestHelloWorld() {
        Assertions.assertEquals("Hello, World!", MainClass.getHelloWorld());
    }
}
