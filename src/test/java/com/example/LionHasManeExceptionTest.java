package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class LionHasManeExceptionTest {

    Feline feline;

    @Test
    public void doesHaveManeWithExceptionTest() {

        try {
            Lion lion = new Lion(feline, "Жывотное");
            lion.doesHaveMane();

            fail();
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}