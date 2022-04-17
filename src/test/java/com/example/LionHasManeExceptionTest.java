package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionHasManeExceptionTest {

    @Test
    public void doesHaveManeWithExceptionTest() {

        Exception expectedException = new Exception("Используйте допустимые значения пола животного - самец или самка");

        try {
            Lion lion = new Lion("Лев");
        } catch (Exception exception) {
            assertEquals(expectedException.getMessage(), exception.getMessage());
        }
    }
}
