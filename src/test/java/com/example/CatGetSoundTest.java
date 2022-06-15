package com.example;

import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;


public class CatGetSoundTest {

    @Mock
    Feline feline;

    @Test
    public void testGetSound() {
        //AAA

        //Arrange
        Cat cat = new Cat(feline);
        String expected = "Мяу";

        //Act
        String actual = cat.getSound();

        //Assert
        assertEquals(expected, actual);

    }
}