package com.github.daimLiat;

import org.junit.Test;

public class ExceptionTest {

    @Test
    public void exceptionTest() {

        try {
            Integer.parseInt("test");
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
